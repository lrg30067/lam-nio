package lam.design.pattern.chainofresponsibility;

import lam.log.Console;

/**
* <p>
* TODO
* </p>
* @author linanmiao
* @date 2017年4月27日
* @version 1.0
*/
public class JiaHuan extends Player{
	
	public JiaHuan(Player successor){
		setSuccessor(successor);
	}

	@Override
	public void handle(int index) {
		if(index == Player.Order.JIAHUAN.getIndex()){
			Console.println(getClass().getSimpleName() + " got drinked.");
		}else{
			Console.println(getClass().getSimpleName() + " passed.");
			next(index);
		}
	}

}
