package prob5;

public class MyStack {
	private int top=-1;
	private String[] buffer;
	
	
	public MyStack(int i) {
		buffer=new String[i];
	}


	public void push(String string) {
		if(top<buffer.length-1) {
			buffer[++top]=string;
		}else {
			int i;
			String[] buffer2= new String[2*buffer.length];
			for(i=0;i<buffer.length;i++) {
				buffer2[i]=buffer[i];
			}
			buffer2[++top]=string;
			buffer=buffer2;
		}
	}


	public boolean isEmpty() {
		if(top<=-1) {
			return true;
		}else {
			return false;
		}
	}


	public String pop() throws MyStackException{
		MyStackException e;
		if(!isEmpty()) {
			return buffer[top--];
		}else {
			throw new MyStackException("stack is empty");
		}
	}
	

}