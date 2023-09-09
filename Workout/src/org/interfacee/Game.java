package org.interfacee;

public interface Game {

	public abstract void one();

    public default void two() {
    System.out.println(" i am dafault");
}

}
