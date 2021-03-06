package lam.netty.demo.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import lam.log.Console;

/**
* <p>
* time client
* </p>
* @author linanmiao
* @date 2016年10月1日
* @versio 1.0
*/
public class TimeClient {
	
	private static Logger logger = LoggerFactory.getLogger(TimeClient.class);
	
	public void connect(String host, int port) throws Exception{
		EventLoopGroup group = new NioEventLoopGroup();
		
		try{
			Bootstrap bootstrap = new Bootstrap();
			bootstrap.group(group)
			.channel(NioSocketChannel.class)
			.option(ChannelOption.SO_KEEPALIVE, true)
			.handler(new TimeClientChannelHandler());
			
			ChannelFuture channelFuture = bootstrap.connect(host, port).sync();
			
			//logger.info("connect to {}:{}", host, port);
			Console.println("connect to %s:%d", host, port);
		
			channelFuture.channel().closeFuture().sync();
		}finally{
			group.shutdownGracefully();
		}
	}
	
	private class TimeClientChannelHandler extends ChannelInitializer<SocketChannel>{
		@Override
		protected void initChannel(SocketChannel socketChannel) throws Exception {
			socketChannel.pipeline().addLast(new LineBasedFrameDecoder(1024));
			socketChannel.pipeline().addLast(new StringDecoder());
			socketChannel.pipeline().addLast(new TimeClientHandler());
		}
	}
	
	public static void main(String[] args) throws Exception{
		String host = "127.0.0.1";
		int port = 8080;
		if(args != null && args.length > 0){
			host = args[0];
			try{
				port = Integer.parseInt(args[1]);
			}catch(NumberFormatException e){
				//logger.error("main error", e);
				Console.println("main error:%d", e.getMessage());
			}
		}
		new TimeClient().connect(host, port);;
	}

}
