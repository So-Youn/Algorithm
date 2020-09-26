package list;

public class ArrayList {
	// size: 몇 개의 값이 추가되었는가..
	private int size = 0;
	// Object를 담는 배열 elementData
	private Object[] elementData = new Object[100];

	public boolean addFirst(Object element) {
		return add(0, element);
	}

	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}

	public boolean add(int index, Object element) {
		for (int i = size - 1; i >= index; i--) {
			elementData[i + 1] = elementData[i];
		}
		elementData[index] = element;
		size++;
		return true;
	}

	public String toString() {
		String str = "[";
		for (int i = 0; i < size; i++) {
			str += elementData[i];
			if (i < size - 1) {
				str += ",";
			}

		}
		return str + "]";
	}

	public Object get(int index) {
		return elementData[index];
	}

	public int size() { //외부에서 마음대로 수정할 수 없게
		return size;
	}
	
	public int indexOf(Object o) {
		for(int i=0;i<size;i++) {
			if(o.equals(elementData[i])) {
				return i;
			}
		}
		return -1; //찾는 값이 없다.
	}
}
