package com.CDAC.Cdac_Center;

public class Center {

	public static void main(String[] args)
	{
		CenterDemo arr[]=new CenterDemo[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=new CenterDemo();
			arr[i].Getdata(arr[i]);
		}
		for(int i=0;i<2;i++)
		{
			arr[i].Display(arr[i]);
		}

	}

}
