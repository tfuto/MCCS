package  util;

public class Pair<LEFT, RIGHT> {
	LEFT left;
	RIGHT right;
	
	public Pair(LEFT l, RIGHT r) {
		this.left = l;
		this.right = r;
	}
	
	public LEFT getLeft() {
		return this.left;
	}
	
	public RIGHT getRight() {
		return this.right;
	}

	public void setLeft(LEFT left){
		this.left = left;
	}
	
	public void setRight(RIGHT right){
		this.right = right;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Pair<?, ?> other = (Pair<?, ?>) obj;

		if (this.left == this.right)
			return true;
		
		if (left == null) {
			if (other.left != null)
				return false;
		} 
		else if (!this.left.equals(other.left))
			return false;
		
		if (right == null) {
			if (other.right != null)
				return false;
		} 
		else if (!this.right.equals(other.right))
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "(" + left + ", " + right + ")";
	}
	
	
}
