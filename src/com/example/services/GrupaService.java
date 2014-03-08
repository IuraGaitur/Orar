package com.example.services;

import java.util.ArrayList;
import java.util.List;

import com.example.entities.Group;
import com.example.entities.Lesson;
import com.example.entities.Teacher;

public class GrupaService {

	String[] days = new String[]{"Luni","Marti","Miercuri","Joi","Vineri","Simbata","Duminica","",""};
	String[] hours = new String[]{"8_00:9_30","9_30:11_00","11_00:12_30","12_30:14_00","14_00:15_30","15_30:17_00",""};
	
	int counterDays = 0;
	int counterHours = 0;
	
	public ArrayList GetListPerechi(String name) {
		
		ArrayList list = new ArrayList();
		
		
		
		for (int column = 0; column < 7; column++) {
			for (int row = 0; row < 7; row++) {
				//position in the table
				//int position = column*7+row;
				
				if(row==0 && column==0)
				{
					list.add(name);
				}
				else if(column == 0 && row != 0)
				{
					list.add(days[counterDays]);
					counterDays++;
				}
				else if(column!=0 && row == 0)
				{
					list.add(hours[counterHours]);
					counterHours++;
				}
				else
				{
					/*Lesson pereche = new Lesson("LFPC",
							new Teacher("Vasile Ungaru", "Profesor de la UTM", 64,
									"PHD.Lector"), "course",512);
					list.add(pereche);*/
				}
				
				
			}
		}

		return list;
	}
}
