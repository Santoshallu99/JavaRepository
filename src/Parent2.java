
public interface Parent2 extends GrandParent {
	default void msg2() {
		System.out.println("I am parent2");
	}
}
