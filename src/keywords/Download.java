package keywords;

import java.util.ArrayList;

import binarytree.BinaryTree;
import binarytree.Node;

public class Download {
	private BinaryTree download;

	public Download() {
		createTree();
	}

	public void createTree() {
        String nodeName = "Download";
        int index = 3;
		download = new BinaryTree();
		ArrayList<String> array = new ArrayList<String>();

//Root
//link for microsoft
		String[] keyWords = {

				"download", "install", "get", "update", "microsoft", "powerpoint", "word","outlook" };
		array = createKeys(keyWords);
		String[] respondArr = { "Follow the link to all the free school applications: https://ask.salemstate.edu/kb/install-microsoft-office-using-your-office-365-email-account  " };
		download.addTo(array, respondArr,nodeName,index);

//Node1
//link for windows
		String[] keyWords1 = { "download", "install", "get", "update", "mac","windows","OS" };
		array = createKeys(keyWords1);

		String[] respondArr1 = { "Follow the link to all the free school applications: https://ask.salemstate.edu/kb/ssu-email-windows-os" };
		download.addTo(array, respondArr1,nodeName,index);

// link for math lab applications
		String[] keyWords2 = { 	"download", "install", "get", "update", "mathlab", "mathematica","apps"};
		array = createKeys(keyWords2);

		String[] respondArr2 = { "Follow the link to all the free school applications: https://apps.salemstate.edu/Citrix/SSUWeb/" };
		download.addTo(array, respondArr2,nodeName,index);

	}

	public Node getRoot() {
		return download.getRoot();
	}

	private ArrayList<String> createKeys(String[] keyWords) {
		ArrayList<String> array = new ArrayList<String>();
		for (String s : keyWords) {
			array.add(s);

		}
		return array;
	}

}
