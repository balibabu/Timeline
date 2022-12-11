package assignment7;

import java.util.Iterator;

class Node<E> {
	E data;
	Node<E> next;
}

public class MyCircularLinkedList<E> implements MyList<E> {

	Node<E> head = null;

	@Override
	public void add(int index, E e) {
		// TODO Auto-generated method stub
		Node<E> node = new Node();
		node.data = e;
		node.next = null;
		if (size() == 0 || index == 0) {
			addFirst(e);
		} else if (size() <= index) {
			addLast(e);
		} else {
			int c = 1;
			Node<E> temp = head;
			while (temp.next != null) {
				if (index == c) {
					Node<E> temp2 = temp.next;
					temp.next = node;
					node.next = temp2;
					break;
				}
				temp = temp.next;
				c++;
			}
		}
	}

	public void showAll() {
		Node<E> temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	@Override
	public int size() {
		int c=0;
		Node<E> temp = head;
		while (temp != null) {
			c++;
			temp=temp.next;
		}
		return c;
	}

	@Override
	public boolean contains(Object o) {
		Node<E> temp = head;
		while (temp != null) {
			if (temp.data == o) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {

			Node current = head;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public E next() {
				if (hasNext()) {
					E data = (E) current.data;
					current = current.next;
					return data;
				}
				return null;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException("Remove not implemented.");
			}

		};
	}

	@Override
	public void clear() {
		head = null;

	}

	@Override
	public E get(int index) {
		int c = 0;
		Node<E> temp = head;
		while (temp != null) {
			if (c == index) {
				return temp.data;
			}
			temp = temp.next;
			c++;
		}
		return null;
	}

	@Override
	public int indexOf(Object e) {
		int c = 0;
		Node<E> temp = head;
		while (temp != null) {
			if (temp.data == e) {
				return c;
			}
			temp = temp.next;
			c++;
		}
		return c;
	}

	@Override
	public int lastIndexOf(E e) {
		int c = 0;
		int index = 0;
		Node<E> temp = head;
		while (temp != null) {
			if (temp.data == e) {
				index = c;
			}
			temp = temp.next;
			c++;
		}
		return index;
	}

	@Override
	public E remove(int index) {
		if (index == 0) {
			removeFirst();
		} else {
			int c = 1;
			Node<E> temp = head;
			while (temp.next != null) {
				if (index == c) {
					temp.next = temp.next.next;
					break;
				}
				temp = temp.next;
				c++;
			}
		}
		return null;
	}

	@Override
	public E set(int index, E e) {
		add(index, e);
		return null;
	}

	public void addLast(E e) {
		Node<E> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		Node<E> node = new Node();
		node.data = e;
		node.next = null;
		temp.next = node;
	}

	public E getFirst() {
		// TODO Auto-generated method stub
		return head.data;

	}

	public E getLast() {
		// TODO Auto-generated method stub
		Node<E> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public void removeFirst() {
		// TODO Auto-generated method stub
		head = head.next;

	}

	public void addFirst(E e) {
		Node<E> node = new Node();
		node.data = e;
		node.next = head;
		head = node;

	}

}
