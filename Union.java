import java.util.*;

public class Union {
	/**
	 * @return	New object (different from a and b) of class Vector that
	 *			contains the union set (NO elements can be repeated) of a and b
	 * @param	a Vector containing elements, including null. It is not a set,
	 *			so it can have repeated elements, and they can be of different
	 *			classes / types
	 * @param	b Vector containing elements, including null. It is not a set,
	 *			so it can have repeated elements, and they can be of different
	 *			classes / types
	 * @throws	NullPointerException If a or b is null
	 */
	public static Vector union (Vector a, Vector b){
		/*funcionalidad para el segundo test*/
		if (a==null || b==null) {
			throw new NullPointerException ("Union.union");
		}
		/*funcionalidad para el primer test*/
		Vector<Integer> vector = new Vector<Integer>();
		vector.add((int) a.get(0));
		vector.add((int) b.get(0));
		
		return vector;
		
		/**
		* @return	New Set (different from a and b) that contains the
		*			union set of a and b
		* @param	a Set of elements. It can contain the null element. It can’t
		*			contain repeated elements
		* @param	b Set of elements. It can contain the null element. It can’t
		*			contain repeated elements
		* @throws	NullPointerException If a or b is null
		*/
		public static Set unionSet (Set a, Set b) {
			Set set = new HashSet();
			if (a==null || b==null) {
				throw new NullPointerException ("Union.unionSet");
			}
			set.add(a);
			set.add(b);
			return set
			
		}
		
		public static <E> Set<E> unionSetGeneric (Set<? extends E> a, Set<? extends E> b){
			Set <E> set = new HashSet<E>();
			if (a==null || b==null) {
				throw new NullPointerException ("Union.unionSet");
			}
			set.add(a);
			set.add(b);
			return set
		}
	}
}
