
public class HashTreeNode<E> {
	private HashTreeNode<E>[] children;
	private E element;
	
	@SuppressWarnings("unchecked")
	public HashTreeNode() {
		this.element = null;
		this.children = (HashTreeNode<E>[]) new HashTreeNode[256];
	}
	
	public E getElement() {
		return this.element;
	}
	
	public E setElement(E element) {
		E tbr = this.element;
		this.element = element;
		return tbr;
	}
	
	public HashTreeNode<E>[] getChildren() {
		return this.children;
	}
}
