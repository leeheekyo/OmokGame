package players;

public class Player {
	private String name;
	private Boolean isMove;
	private String color;
	private int id;
	
	public Player(String name, int id, String color){
		this.name = name;
		this.id = id;
		this.color = color;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setMove(boolean move){
		isMove = move;
	}
	public boolean isMove(){
		return isMove;
	}
	public int getID(){
		return id;
	}
}
