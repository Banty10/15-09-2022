package com.array.pll;

public class Apartmentowner {

		
		private String owner;
		private String[] apartments;
		
		public Apartmentowner(String owner) //parameterized constructor with Owner Name
		{
			this.owner=owner;      
			apartments=new String[10];    
		}
		
		public String getOwner()   //whenever getOwner will be called Owner's name will be returned.
		{
			return owner;
		}
		
		public String getApartment(int slot)    //whenever getApartment will be called Apartment's name will be returned according to slot.
		{
			return apartments[slot];
		}
		
		public void setApartment(String address,int slot) //apartments will be set with their slot
		{
			apartments[slot]=address;
		}
		
		public int countApartments()    //number of apartments will be shown
		{
			int num=0;
			for(int i=0;i<10;i++)
				if(apartments[i] !=null)
					num++;
			return num;
		}
		
		public void reorganizeApartments() //apartments will be reorganized as earlier they were set
		{
			int empty=-1;
			for(int i=0;i<10;i++)
			{
				if(apartments[i]==null && empty !=-1)
					empty=i;
				if(apartments[i]!=null && empty != -1)
				{
					apartments[empty]=apartments[i];
					apartments[i]=null;
					empty++;
				}
			}	
		}
		
		@Override
		public String toString()
		{
			String ris="";
			ris+="Owner: "+owner;
			for(int i=0;i<10;i++)
				if(apartments[i]!=null)
					ris+="\n Apartment "+i+": "+apartments[i];
			return ris;

	}

}
