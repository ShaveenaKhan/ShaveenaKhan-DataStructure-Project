/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shaveenakhan_project;

/**
 *
 * @author User
 */
public class HuffmanArray {
    public static void create_array(char data1[],int frequency1[],ArrayNode a[],int n) 
	{
		for(int i=1;i<=n;i++)
		{
			a[i] = new ArrayNode();
			a[i].left=null;
			a[i].right=null;
			a[i].letter=data1[i-1];
			a[i].frequency=frequency1[i-1];
		}
		
	}
}