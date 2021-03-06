package lam.pool.support;

import java.io.PrintWriter;
import java.util.Deque;

import lam.queue.LDeque;

/**
* <p>
* pool object
* </p>
* @author linanmiao
* @date 2017年3月22日
* @versio 1.0
*/
public abstract class SPooledObject<T> /*implements PooledObject<T>*/
	implements Comparable<SPooledObject<T>>{
	
	public abstract T getSObject();
	public abstract long getSCreateTime();
	public abstract long getSActiveTimeMillis();
	public abstract long getSIdleTimeMillis();
	public abstract long getSLastBorrowTime();
	public abstract long getSLastReturnTime();
	public abstract long getSLastUsedTime();
	public abstract boolean startSEvictionTest();
	public abstract boolean endSEvictionTest(LDeque<SPooledObject<T>> idleQueue);
	public abstract boolean allocate();
	public abstract boolean deallocate();
	public abstract void invalidate();
	public abstract void setLogAbandoned(boolean logAbandoned);
	public abstract void use();
	public abstract void printStackTrace(PrintWriter writer);
	public abstract SPooledObjectState getSState();
	public abstract void markAbandoned();
	public abstract void markReturning();
	
/*//	//	@Override
	public T getObject() {
		return getSObject();
	}
	
//	//	@Override
	public long getCreateTime() {
		return getSCreateTime();
	}
	
//	//	@Override
	public long getActiveTimeMillis() {
		return getSActiveTimeMillis();
	}
	
//	//	@Override
	public long getIdleTimeMillis() {
		return getSIdleTimeMillis();
	}
	
//	//	@Override
	public long getLastBorrowTime() {
		return getSLastBorrowTime();
	}
	
	//	@Override
	public long getLastReturnTime() {
		return getSLastBorrowTime();
	}
	
	//	@Override
	public long getLastUsedTime() {
		return getSLastBorrowTime();
	}
	
	//	@Override
	public int compareTo(PooledObject<T> other) {
		return compareSTo((SPooledObject<T>)other);
	}
	
	//	@Override
	public boolean startEvictionTest(){
		return startSEvictionTest();
	}
	
	//	@Override
	public boolean endEvictionTest(Deque<PooledObject<T>> idleQueue) {
		//return endSEvictionTest((Deque<SPooledObject<T>>)idleQueue);
		return true;
	}
	
	//	@Override
	public PooledObjectState getState() {
		// TODO Auto-generated method stub
		return null;
	}*/

}
