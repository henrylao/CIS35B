package scale;

import exception.AutoException;

public interface EditThread {
	public void updateOptionName(int op, String threadName,String autoID, String setName,String oldName, String newName);
}