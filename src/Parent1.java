
public interface Parent1 extends GrandParent {
default void msg1() {
	System.out.println("I am parent1");
}
}
