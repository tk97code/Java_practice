package Chapter6;

interface Message {
	public String getHeader();
	public void setHeader(String str);
	public String getBody();
	public void setBody(String str);
	public String getType();
	public void setType(String str);
	public void printMessage();
}

class TextMessage implements Message
{
	String header;
	String body;
	String type;
	public TextMessage(String header, String body)
	{
		this.body=body;
		this.header=header;
		this.type="text";
	}
	public String getHeader()
	{
		return header;
	}
	public void setHeader(String str)
	{
		header=str;
	}
	public String getBody()
	{
		return body;
	}
	public void setBody(String str)
	{
		body=str;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String str)
	{
		type=str;
	}
	public void printMessage()
	{
		System.out.println("Type: "+type+"\nheader: "+header+"\nbody: "+body);
	}
}


class BinaryMessage implements Message
{
	String header;
	String body;
	String type;
	public BinaryMessage(String header, String body)
	{
		this.body=body;
		this.header=header;
		this.type="binary";
	}
	public String getHeader()
	{
		return header;
	}
	public void setHeader(String str)
	{
		header=str;
	}
	public String getBody()
	{
		return body;
	}
	public void setBody(String str)
	{
		body=str;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String str)
	{
		type=str;
	}
	public void printMessage()
	{
		System.out.println("Type: "+type+"\nheader: "+header+"\nbody: "+body);
	}
}

class MessageProcucer {
	private Message m;
	
	public Message create(String header, String body, String type) {
		if ("text".equalsIgnoreCase(type)) {
			m = new TextMessage(header, body);
		} else if ("binary".equalsIgnoreCase(type)) {
			m = new BinaryMessage(header, body);
		} else {
			System.out.println("Invalid type");
		}
		
		return m;
	}
	
	public void send(MessageConsumer consumer) {
		if (m != null) {
            consumer.receive(this);
        } else {
            System.out.println("No message to send");
        }
	}
	
	public Message getMessage() {
		return m;
	}
}

class MessageConsumer {
	private Message receivedMessage;

    public void receive(MessageProcucer producer) {
        this.receivedMessage = producer.getMessage();
    }

    public void show() {
        if (receivedMessage != null) {
            System.out.println("Received message:");
            receivedMessage.printMessage();
        } else {
            System.out.println("No message to show");
        }
    }
}

public class ex03 {

	public static void main(String[] args) {
		MessageProcucer producer = new MessageProcucer();
		MessageProcucer producer2 = new MessageProcucer();
		MessageConsumer consumer = new MessageConsumer();
		
		producer.create("h1", "b1", "text");
		producer.send(consumer);
		
		producer2.create("hi", "hi everyone", "text");
		producer2.send(consumer);
		
		consumer.receive(producer);
		consumer.show();
	}

}
