package level17.task1716;

public interface Vehicle {
	
	default void start() {
		System.out.println("Начинаю движение.");
	}
	
	void move();
	
	default void stop() {
		System.out.println("Останавливаюсь.");
	}
	
}
