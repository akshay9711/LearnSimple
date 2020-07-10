package com.creatpixel.learnsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import java.util.Random;

public class HindiNumbers extends AppCompatActivity {
    static final String MSG2 = "com.creatpixel.learnsimple.MSG2";

    public void clicked(View view){
            Intent intent = new Intent(this, NumberList.class);
            intent.putExtra(MSG2, "HindiNumbers");
            startActivity(intent);
    }
    public void randomClicked(View view){
        //For Hindi
//        String[] numNames = {"Shuniye", "Ek", "Do", "Teen", "Chaar", "Panch", "Cheh", "Saath", "Aath", "Nao", "Das",
//                            "Gyaarah", "Baarah", "Tehrah", "Chaudah", "Pandrah", "Saulah", "Satrah", "Atharah", "Unnis", "Bees",
//                            "Ikis", "Bais", "Teis", "Chaubis", "Pachis", "Chabbees", "Satais", "Athais", "Unatis", "Tis",
//                            "Ikatis", "Batis", "Tentis", "Chautis", "Pentis", "Chatis", "Setis", "Adhtis", "Untaalis", "Chalis",
//                            "Iktalis", "Byalis", "Tetalis", "Chavalis", "Pentalis", "Chyalis", "Setalis", "Adtalis", "Unachas", "Pachas",
//                            "Ikyavan", "Baavan", "Tirepan", "Chauvan", "Pachpan", "Chappan", "Satavan", "Athaavan", "Unsadh", "Saadh",
//                            "Iksadh", "Baasad", "Tirsadh", "Chausadh", "Pensadh", "Chiyasadh", "Sadhsadh", "Asdhsadh", "Unahtar", "Sattar",
//                            "Ikahtar", "Bahatar", "Tihatar", "Chauhatar", "Pachhater", "Chiyahatar", "Satahatar", "Adhahatar", "Unnasi", "Assi",
//                            "Ikyasi", "Byaasi", "Tirasi", "Chaurasi", "Pachasi", "Chiyaasi", "Sataasi", "Athasi", "Nauasi", "Nabbe",
//                            "Ikyaanave", "Baanave", "Tiranave", "Chauraanave", "Pachaanave", "Chiyaanave", "Sataanave", "Adhaanave", "Ninyaanave", "Ek Sau"};
        //For japanese
        String[] numNames = {"零", "一", "二", "三", "四", "五", "六", "七", "八",
                             "九", "十", "十一", "十二", "十三", "十四", "十五", "十六",
                             "十七", "十八", "十九", "二十", "二十一", "二十二", "二十三", "二十四", "二十五", "二十六", "二十七", "二十八",
                             "二十九", "三十", "三十一", "三十二", "三十三", "三十四", "三十五", "三十六", "三十七",
                             "三十八", "三十九", "四十", "四十一", "四十二", "四十三", "四十四", "四十五", "四十六", "四十七", "四十八", "四十九",
                 "五十", "五十一", "五十二", "五十三", "五十四", "五十五", "五十六", "五十七", "五十八", "五十九", "六十", "六十一", "六十二", "六十三", "六十四", "六十五", "六十六", "六十七", "六十八", "六十九", "七十", "七十一", "七十二", "七十三", "七十四"
                , "七十五", "七十六", "七十七", "七十八", "七十九", "八十", "八十一", "八十二", "八十三", "八十四", "八十五", "八十六", "八十七", "八十八", "八十九", "九十", "九十一", "九十二", "九十三", "九十四", "九十五", "九十六", "九十七", "九十八", "九十九", "百"};

        Random random = new Random();
        TextView number = findViewById(R.id.largNumber);
        TextView numberTexts = findViewById(R.id.numberText);
        int r = random.nextInt(101);
        String rStr = Integer.toString(r);
        number.setText(rStr);

        numberTexts.setText(numNames[r]);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_numbers);
    }
}
