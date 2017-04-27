package lam.design.pattern.chainofresponsibility.rh;

import java.util.Objects;

import lam.design.pattern.chainofresponsibility.rh.AbstractRequest.Level;
import lam.log.Console;

/**
* <p>
* TODO
* </p>
* @author linanmiao
* @date 2017年4月27日
* @versio 1.0
*/
public class HandlerL02 extends AbstractHandler{

	public HandlerL02() {
		super(Level.L02);
	}

	@Override
	public void setNext(AbstractHandler next) {
		Objects.requireNonNull(next, "next handler cann't be null");
		super.next = next;
	}

	@Override
	public void handle(AbstractRequest request) {
		Console.println(getClass().getSimpleName() + " handle " + request);
	}

}