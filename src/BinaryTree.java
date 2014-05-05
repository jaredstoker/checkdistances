//Aaron McGhie
public class BinaryTree {
	private BTNode root;
	private City destination;
	
	public BinaryTree(BTNode root, City destination) {
		this.root = root;
		this.destination = destination;
		populateTree();
	}
	
	private void populateTree() {
		setChildren(root);
	}
	
	protected void setChildren(BTNode node) {
		if(node.city.checkForConnectingCity(destination)) {
			node.leftChild = new BTNode(destination);
			node.rightChild = null;
		}
		else {
			int i=0;
			while(node.leftChild == null || node.rightChild == null) {
				City currentCity = node.city.getDistanceBySize(i).getCity();
				BTNode tempNode = new BTNode(currentCity);
				if(tempNode.leadsToDestinationBT(node.city, destination)) {
					if(node.leftChild == null) {
						node.leftChild = tempNode;
						setChildren(node.leftChild);
					}
					else {
						node.rightChild = tempNode;
						setChildren(node.rightChild);
					}
				}
				i++;
			}
			
		}
	}
}
