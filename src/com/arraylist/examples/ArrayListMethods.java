package com.arraylist.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMethods extends ArrayList<Integer>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();


		/**add(E e)
		Appends the specified element to the end of this list.
		 */
		for(int i = 0; i<=10; i++) {
			list.add(i);

		}


		/** add(int index, E element)
           Inserts the specified element at the specified position in this list.
		 */
		list.add(11,11);


		/**addAll(Collection<? extends E> c)
        Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
		 */
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(23);
		list2.add(24);
		list2.add(25);

		list.addAll(list2);
		System.out.println(list);


		/**	addAll(int index, Collection<? extends E> c)
			Inserts all of the elements in the specified collection into this list, starting at the specified position.
		 */

		list.addAll(5,list2);
		System.out.println(list);

		/**boolean	contains(Object o)
		   Returns true if this list contains the specified element.
		 */

		System.out.println(list.contains(3));

		/** ensureCapacity(int minCapacity)
			Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.
		 */

		list.ensureCapacity(20);

		/**get(int index)
		Returns the element at the specified position in this list.
		 */
		System.out.println(list.get(6));


		/**indexOf(Object o)
         Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
		 */
		System.out.println(list.indexOf(23));

		/**lastIndexOf(Object o)
			Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
		 */
		System.out.println(list.lastIndexOf(23));

		/**	forEach(Consumer<? super E> action)
			Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
		 */
		System.out.println("Printing for each:");
		list.forEach( c -> System.out.println(c));


		/**isEmpty()
		   Returns true if this list contains no elements.
		 */
		System.out.println(list.isEmpty());

		/**size()
	    Returns the number of elements in this list.
		 */
		System.out.println(list.size());


		/**iterator()
	    Returns an iterator over the elements in this list in proper sequence.
		 */
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		/**	remove(int index)
			Removes the element at the specified position in this list.
		 */
		list.remove(5);

		/**	removeAll(Collection<?> c)		
		 * Removes from this list all of its elements that are contained in the specified collection.
		 */
		list.removeAll(list2);
		System.out.println(list);


		/**removeIf(Predicate<? super E> filter)
		Removes all of the elements of this collection that satisfy the given predicate.
		 */
		list.removeIf(p-> p>10);
		System.out.println(list);



		/**	removeRange(int fromIndex, int toIndex)
            Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
		 */
		ArrayListMethods removeArray = new ArrayListMethods();
		for(int i = 0; i<5;i++) {
			removeArray.add(i);
		}
		removeArray.removeRange(2, 4);
		System.out.println(removeArray);

		/**set(int index, E element)
		Replaces the element at the specified position in this list with the specified element.
		 */
		list.set(0, 11);
		System.out.println(list);

		/**sort(Comparator<? super E> c)
		Sorts this list according to the order induced by the specified Comparator.
		 */


		/**	subList(int fromIndex, int toIndex)
		 * Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
		 */
		List<Integer> sublist = list.subList(0,7);
		System.out.println(sublist);


		/**retainAll(Collection<?> c)
		  Retains only the elements in this list that are contained in the specified collection.
		 */
		list.retainAll(sublist);
		System.out.println(list);

		/**toArray()
		Returns an array containing all of the elements in this list in proper sequence (from first to last element).
		 */
		Object[] array = list.toArray();


		/**	toArray(T[] a)
			Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
		 */
		Integer[] x = new Integer[list.size()];
		x = list.toArray(x);

		/**	trimToSize()
			Trims the capacity of this ArrayList instance to be the list's current size.
		 */
		list.trimToSize();


		/**	clear()
			Removes all of the elements from this list.
		 */
		list.clear();
		System.out.println(list);




	}


}

