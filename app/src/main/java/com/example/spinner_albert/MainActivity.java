package com.example.spinner_albert;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener , AdapterView.OnItemClickListener
{

    ListView lv1;
    Spinner spin1;
    TextView tv1 , tv2 , tv3 , tv4;
    ArrayAdapter<String> adp_Grade_8 , adp_Grade_9 ,adp_Grade_10 ,adp_Grade_11;

    int option = 0;


    String[] grade_8_lastNames = {"Cohen", "Levi", "Mizrahi", "Peretz", "Shahar", "Abramson", "Eldar", "Goldman", "Malka", "Rosen", "Aviv", "Baron", "Halevi", "Roth", "Segal", "Tzur", "Dahan", "Fridman", "Gal", "Amsalem"};
    String[] grade_9_lastNames = {"Avraham", "Ben-Ami", "Davidson", "Fischer", "Gavriel", "Halperin", "Israeli", "Katz", "Laniado", "Maimon", "Nissan", "Oron", "Polanski", "Qeshet", "Raz", "Shani", "Tal", "Uzan", "Vardi", "Ziv"};
    String[] grade_10_lastNames = {"Green", "Bluestein", "Shaked", "Carmel", "Regev", "Shilon", "Tamir", "Dov", "Erez", "Farkash", "Gold", "Harari", "Itzhak", "Koren", "Livne", "Mor", "Niv", "Paz", "Stern", "Yair"};
    String[] grade_11_lastNames = {"Alon", "Braverman", "Charon", "Doron", "Eldan", "Frankel", "Goren", "Handel", "Ilan", "Kadmon", "Lavi", "Morad", "Neeman", "Perl", "Rom", "Shmueli", "Tzuriel", "Vaknin", "Yarden", "Zamir"};


    String[] grade_8_students = {"Sos", "Bob", "Dod", "Coc", "Ror", "Mom", "Non", "Aoa", "Pop", "Xox", "Zee", "Fin", "Lin", "Ben", "Jen", "Lex", "Sam", "Roy", "Jan", "Kit"};
    String[] grade_9_students = {"Mmm", "Nnn", "Rrr", "Ddd", "Lll", "Iii", "Ooo", "Ggg", "Kkk", "Fff", "Joe", "Amy", "Max", "Tim", "Fox", "Eve", "Ray", "Nia", "Pam", "Zoe"};
    String[] grade_10_students = {"Qwe", "Wer", "Tyu", "Uio", "Lph", "Cvn", "Myu", "Xor", "And", "Hyl", "Avi", "Leo", "Eva", "Sky", "Lee", "Kim", "Tia", "Vic", "Dan", "Lou"};
    String[] grade_11_students = {"Albert", "Anna", "Lior", "Noam", "Bob", "Nod", "Rod", "Vod", "Adp", "Por", "Mia", "Tom", "Ron", "Jay", "Ash", "Ned", "Ian", "Joy", "Gus", "Ken"};

    String[] grade_8_birthdates = {"05/04/2008", "12/07/2008", "20/01/2008", "15/03/2008", "22/06/2008","30/10/2008", "11/02/2008", "09/05/2008", "07/09/2008", "18/08/2008", "25/01/2008", "03/04/2008", "21/07/2008", "17/11/2008", "29/02/2008", "04/10/2008", "13/01/2008", "08/12/2008", "23/05/2008", "14/08/2008"};

    String[] grade_9_birthdates = {"12/03/2007", "20/05/2007", "16/09/2007", "02/07/2007", "10/12/2007", "05/02/2007", "18/11/2007", "24/04/2007", "30/06/2007", "21/01/2007", "11/05/2007", "07/07/2007", "22/09/2007", "19/10/2007", "02/03/2007", "14/05/2007", "13/06/2007", "06/09/2007", "29/11/2007", "23/08/2007"};

    String[] grade_10_birthdates = {"01/01/2006", "05/08/2006", "22/02/2006", "13/05/2006", "04/06/2006", "16/09/2006", "03/11/2006", "07/01/2006", "21/03/2006", "25/07/2006", "10/01/2006", "20/06/2006", "17/08/2006", "09/02/2006", "18/09/2006", "06/04/2006", "22/05/2006", "29/10/2006", "03/03/2006", "11/07/2006"};

    String[] grade_11_birthdates = {"19/12/2005", "23/10/2005", "02/05/2005", "11/08/2005", "16/01/2005", "03/02/2005", "27/09/2005", "15/11/2005", "28/04/2005", "05/06/2005", "13/02/2005", "01/03/2005", "04/10/2005", "21/07/2005", "09/09/2005", "14/05/2005", "25/08/2005", "22/11/2005", "12/01/2005", "17/06/2005"};


    String[] grade_8_phone_numbers = {"050-1234567", "052-2345678", "053-3456789", "054-4567890", "055-5678901", "050-6789012", "052-7890123", "053-8901234", "054-9012345", "055-0123456", "050-1357924", "052-2468135", "053-3579246", "054-4680357", "055-5791468", "050-6802579", "052-7913680", "053-8024791", "054-9135802", "055-0246913"};

    String[] grade_9_phone_numbers = {"050-2345678", "052-3456789", "053-4567890", "054-5678901", "055-6789012", "050-7890123", "052-8901234", "053-9012345", "054-0123456", "055-1357924", "050-2468135", "052-3579246", "053-4680357", "054-5791468", "055-6802579", "050-7913680", "052-8024791", "053-9135802", "054-0246913", "055-1357024"};

    String[] grade_10_phone_numbers = {"050-3456789", "052-4567890", "053-5678901", "054-6789012", "055-7890123", "050-8901234", "052-9012345", "053-0123456", "054-1357924", "055-2468135", "050-3579246", "052-4680357", "053-5791468", "054-6802579", "055-7913680", "050-8024791", "052-9135802", "053-0246913", "054-1357024", "055-2467025"};

    String[] grade_11_phone_numbers = {"050-4567890", "052-5678901", "053-6789012", "054-7890123", "055-8901234", "050-9012345", "052-0123456", "053-1357924", "054-2468135", "055-3579246", "050-4680357", "052-5791468", "053-6802579", "054-7913680", "055-8024791", "050-9135802", "052-0246913", "053-1357024", "054-2467025", "055-3578036"};


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wedding();

        spin1.setOnItemSelectedListener(this);
        String[] choose_class = {"Choose class","Grade_8", "Grade_9", "Grade_10", "Grade_11"};
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,choose_class);
        spin1.setAdapter(adp);


        adp_Grade_8 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,grade_8_students);
        adp_Grade_9 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,grade_9_students);
        adp_Grade_10 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,grade_10_students);
        adp_Grade_11 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,grade_11_students);

        lv1.setOnItemClickListener(this);
        lv1.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
    }

    public void wedding()
    {
        lv1 = (ListView) findViewById(R.id.lv1);
        spin1 = (Spinner) findViewById(R.id.spin1);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        /*
        1 - Grade_8
        2 - Grade_9
        3 - Grade_10
        4 - Grade_11
        */

        if(position != 0)
        {
            option = position - 1;
            if(option == 0)
            {
                lv1.setAdapter(adp_Grade_8);
            }
            else if(option == 1)
            {
                lv1.setAdapter(adp_Grade_9);
            }
            else if(option == 2)
            {
                lv1.setAdapter(adp_Grade_10);
            }
            else
            {
                lv1.setAdapter(adp_Grade_11);
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) { }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        if(option == 0)
        {
            tv1.setText(grade_8_lastNames[position]);
            tv2.setText(grade_8_students[position]);
            tv3.setText(grade_8_birthdates[position]);
            tv4.setText(grade_8_phone_numbers[position]);
        }
        else if(option == 1)
        {
            tv1.setText(grade_9_lastNames[position]);
            tv2.setText(grade_9_students[position]);
            tv3.setText(grade_9_birthdates[position]);
            tv4.setText(grade_9_phone_numbers[position]);
        }
        else if(option == 2)
        {
            tv1.setText(grade_10_lastNames[position]);
            tv2.setText(grade_10_students[position]);
            tv3.setText(grade_10_birthdates[position]);
            tv4.setText(grade_10_phone_numbers[position]);
        }
        else
        {
            tv1.setText(grade_11_lastNames[position]);
            tv2.setText(grade_11_students[position]);
            tv3.setText(grade_11_birthdates[position]);
            tv4.setText(grade_11_phone_numbers[position]);
        }
    }
}