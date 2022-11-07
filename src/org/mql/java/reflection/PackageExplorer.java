/**
 * 
 */
package org.mql.java.reflection;

import java.io.File;
import java.util.Vector;

/**
 * @author MOUKHAFI Anass
 *
 * Nov 7, 2022
 */
public class PackageExplorer {
	/**
	 * 
	 */
	public PackageExplorer() {
		// TODO Auto-generated constructor stub
	}
	
	public String[] getClassList(String packageName){
		String classPath = System.getProperty("java.class.path");
		System.out.println(classPath);
		
		String packagePath = packageName.replace(".", "/"); // Replace dots by slashes
		System.out.println(packagePath);
		
		File dir =  new File(classPath+ "/" + packagePath);
		File files[] = dir.listFiles(); // returns the files and directories
		Vector<String> v = new Vector<String>();
		for(File file : files) {
			if(file.isFile() && file.getName().endsWith(".class")) {
				String name = file.getName().replace(".class", "");
				v.add(packageName + "." + name);
			}
		}
		String t[] = new String[v.size()];
		v.toArray(t); // Fill elements of vector in the array to return
		return t;
	}
}
