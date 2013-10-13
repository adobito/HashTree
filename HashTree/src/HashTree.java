
public class HashTree<E> {
	
	private HashTreeNode<E> root;
	
	
	public HashTree() {
		this.root = new HashTreeNode<E>();
	}
	/**
	 * Puts element in key position
	 * @param key
	 * @param element
	 * @return Previously stored element
	 */
	public E put(String key, E element) {
		if(key == null) {
			throw new IllegalArgumentException("Key cannot be null.");
		}
		return putRecursive(key, element, this.root);
	}
	/**
	 * Gets element at key position
	 * @param key
	 * @return Element stored at key
	 */
	public E get(String key) {
		if(key == null) {
			throw new IllegalArgumentException("Key cannot be null.");
		}
		return getRecursive(key, this.root);
	}
	/**
	 * Puts element in key position, adding missing nodes along the way.
	 * @param key
	 * @param element
	 * @param root
	 * @return
	 */
	private E putRecursive(String key, E element, HashTreeNode<E> root) {
		if(key.isEmpty())
			return root.setElement(element);
		HashTreeNode<E> newRoot = root.getChildren()[key.charAt(0)];
		if(newRoot == null) {
			newRoot = new HashTreeNode<E>();
			root.getChildren()[key.charAt(0)] = newRoot;
			}
		return putRecursive(key.substring(1), element, newRoot);
	}
/**
 * Gets element at key position or returns null if key is missing.
 * @param key
 * @param root
 * @return element at key position or null
 */
	private E getRecursive(String key, HashTreeNode<E> root) {
		if(key.isEmpty())
			return root.getElement();
		HashTreeNode<E> newRoot = root.getChildren()[key.charAt(0)];
		if(newRoot == null) {
			return null;
			}
		return getRecursive(key.substring(1), newRoot);
	}

}
