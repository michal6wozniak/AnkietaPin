package com.example.user.ankieta;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "turystyka_gdynia.db";
    public static final String TABLE_NAME = "odpowiedzi_gdynia";
    public static final String COL_1 = "Ankieter";
    public static final String COL_2 = "Data";
    public static final String COL_3 = "Miejsce";
    public static final String COL_4 = "ID";
    public static final String COL_5 = "Pyt1";
    public static final String COL_6 = "Pyt2";
    public static final String COL_7 = "Pyt3K";
    public static final String COL_8 = "Pyt3W";
    public static final String COL_9 = "Pyt3M";
    public static final String COL_10 = "Pyt4W";
    public static final String COL_11 = "Pyt4M";
    public static final String COL_12 = "Pyt4K";
    public static final String COL_13 = "Pyt5";
    public static final String COL_14 = "Pyt6";
    public static final String COL_15 = "Pyt6I";
    public static final String COL_16 = "Pyt7";
    public static final String COL_17 = "Pyt7N";
    public static final String COL_18 = "Pyt8";
    public static final String COL_19 = "Pyt8I";
    public static final String COL_20 = "Pyt9";
    public static final String COL_21 = "Pyt10";
    public static final String COL_22 = "Pyt10I";
    public static final String COL_23 = "Pyt11OdpI";
    public static final String COL_24 = "Pyt11OdpII";
    public static final String COL_25 = "Pyt11OdpIII";
    public static final String COL_26 = "Pyt11OdpVI";
    public static final String COL_27 = "Pyt11OdpV";
    public static final String COL_28 = "Pyt11I";
    public static final String COL_29 = "Pyt12";
    public static final String COL_30 = "Pyt13";
    public static final String COL_31 = "Pyt14";
    public static final String COL_32 = "Pyt14I";
    public static final String COL_33 = "Pyt15OdpI";
    public static final String COL_34 = "Pyt15OdpII";
    public static final String COL_35 = "Pyt15OdpIII";
    public static final String COL_36 = "Pyt15OdpIV";
    public static final String COL_37 = "Pyt15I";
    public static final String COL_38 = "Pyt16";
    public static final String COL_39 = "Pyt17";
    public static final String COL_40 = "Pyt17I";
    public static final String COL_41 = "Pyt18OdpI";
    public static final String COL_42 = "Pyt18OdpII";
    public static final String COL_43 = "Pyt18OdpIII";
    public static final String COL_44 = "Pyt18I";
    public static final String COL_45 = "Pyt19OdpI";
    public static final String COL_46 = "Pyt19OdpII";
    public static final String COL_47 = "Pyt19OdpIII";
    public static final String COL_48 = "Pyt19OdpVI";
    public static final String COL_49 = "Pyt19OdpV";
    public static final String COL_50 = "Pyt19I";
    public static final String COL_51 = "Pyt20OdpI";
    public static final String COL_52 = "Pyt20OdpII";
    public static final String COL_53 = "Pyt20OdpIII";
    public static final String COL_54 = "Pyt20OdpIV";
    public static final String COL_55 = "Pyt20OdpV";
    public static final String COL_56 = "Pyt20OdpVI";
    public static final String COL_57 = "Pyt20OdpVII";
    public static final String COL_58 = "Pyt20OdpVIII";
    public static final String COL_59 = "Pyt20OdpIX";
    public static final String COL_60 = "Pyt20I";
    public static final String COL_61 = "Pyt21";
    public static final String COL_62 = "Pyt22OdpI";
    public static final String COL_63 = "Pyt22OdpII";
    public static final String COL_64 = "Pyt22OdpIII";
    public static final String COL_65 = "Pyt22OdpIV";
    public static final String COL_66 = "Pyt22OdpV";
    public static final String COL_67 = "Pyt22OdpVI";
    public static final String COL_68 = "Pyt22OdpVII";
    public static final String COL_69 = "Pyt22OdpVIII";
    public static final String COL_70 = "Pyt22OdpIX";
    public static final String COL_71 = "Pyt22OdpX";
    public static final String COL_72 = "Pyt22OdpXI";
    public static final String COL_73 = "Pyt22OdpXII";
    public static final String COL_74 = "Pyt22OdpXIII";
    public static final String COL_75 = "Pyt22OdpXIV";
    public static final String COL_76 = "Pyt23";
    public static final String COL_77 = "Pyt24";
    public static final String COL_78 = "Pyt25";
    public static final String COL_79 = "Pyt26OdpI";
    public static final String COL_80 = "Pyt26OdpII";
    public static final String COL_81 = "Pyt26OdpIII";
    public static final String COL_82 = "Pyt26OdpIV";
    public static final String COL_83 = "Pyt26OdpV";
    public static final String COL_84 = "Pyt26OdpVI";
    public static final String COL_85 = "Pyt26OdpVII";
    public static final String COL_86 = "Pyt26I";
    public static final String COL_87 = "Pyt27";
    public static final String COL_88 = "Pyt28";
    public static final String COL_89 = "Pyt29";
    public static final String COL_90 = "Pyt29I";
    public static final String COL_91 = "Pyt30";
    public static final String COL_92 = "Pyt31";
    public static final String COL_93 = "Pyt32";
    public static final String COL_94 = "Pyt33";
    public static final String COL_95 = "Pyt33W";
    public static final String COL_96 = "Pyt33I";
    public static final String COL_97 = "M1";
    public static final String COL_98 = "M2";
    public static final String COL_99 = "M3";
    public static final String COL_100 = "M4";
    public static final String COL_101 = "M5";



    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " + TABLE_NAME + " ("+COL_1+" TEXT, "+COL_2+" TEXT, "+COL_3+" TEXT, "+COL_4+" INTEGER PRIMARY KEY AUTOINCREMENT, "+COL_5+" TEXT, "+COL_6+" TEXT" +
                ", "+COL_7+" TEXT, "+COL_8+" TEXT, "+COL_9+" TEXT, "+COL_10+" TEXT, "+COL_11+" TEXT, "+COL_12+" TEXT, "+COL_13+" TEXT, "+COL_14+" TEXT, "+COL_15+" TEXT, "+COL_16+" TEXT" +
                ", "+COL_17+" INTEGER, "+COL_18+" TEXT, "+COL_19+" TEXT, "+COL_20+" TEXT, "+COL_21+" TEXT, "+COL_22+" TEXT, "+COL_23+" TEXT, "+COL_24+" TEXT, "+COL_25+" TEXT, "+COL_26+" TEXT" +
                ", "+COL_27+" TEXT, "+COL_28+" TEXT, "+COL_29+" INTEGER, "+COL_30+" TEXT, "+COL_31+" TEXT, "+COL_32+" INTEGER, "+COL_33+" TEXT, "+COL_34+" TEXT, "+COL_35+" TEXT, "+COL_36+" TEXT" +
                ", "+COL_37+" TEXT, "+COL_38+" TEXT, "+COL_39+" TEXT, "+COL_40+" TEXT, "+COL_41+" TEXT, "+COL_42+" TEXT, "+COL_43+" TEXT, "+COL_44+" TEXT, "+COL_45+" TEXT, "+COL_46+" TEXT" +
                ", "+COL_47+" TEXT, "+COL_48+" TEXT, "+COL_49+" TEXT, "+COL_50+" TEXT, "+COL_51+" TEXT, "+COL_52+" TEXT, "+COL_53+" TEXT, "+COL_54+" TEXT, "+COL_55+" TEXT, "+COL_56+" TEXT" +
                ", "+COL_57+" TEXT, "+COL_58+" TEXT, "+COL_59+" TEXT, "+COL_60+" TEXT, "+COL_61+" TEXT, "+COL_62+" INTEGER, "+COL_63+" INTEGER, "+COL_64+" INTEGER, "+COL_65+" INTEGER, "+COL_66+" INTEGER" +
                ", "+COL_67+" INTEGER, "+COL_68+" INTEGER, "+COL_69+" INTEGER, "+COL_70+" INTEGER, "+COL_71+" INTEGER, "+COL_72+" INTEGER, "+COL_73+" INTEGER, "+COL_74+" INTEGER, "+COL_75+" INTEGER, "+COL_76+" INTEGER" +
                ", "+COL_77+" INTEGER, "+COL_78+" INTEGER, "+COL_79+" TEXT, "+COL_80+" TEXT, "+COL_81+" TEXT, "+COL_82+" TEXT, "+COL_83+" TEXT, "+COL_84+" TEXT, "+COL_85+" TEXT, "+COL_86+" TEXT" +
                ", "+COL_87+" TEXT, "+COL_88+" TEXT, "+COL_89+" TEXT, "+COL_90+" TEXT, "+COL_91+" INTEGER, "+COL_92+" INTEGER, "+COL_93+" TEXT, "+COL_94+" TEXT, "+COL_95+" TEXT, "+COL_96+" INTEGER" +
                ", "+COL_97+" TEXT, "+COL_98+" TEXT, "+COL_99+" TEXT, "+COL_100+" TEXT, "+COL_101+" TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
    }

    public boolean insertDataManiActivity (String ankieter, String miejsce, String jezyk){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, ankieter);
        contentValues.put(COL_3, miejsce);
        contentValues.put(COL_2, jezyk);

        long result = db.insert(TABLE_NAME, null, contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public boolean UpadatePytaniePierwsze(String Pyt2, String Pyt1, String Czas){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_5+" = '"+Pyt1+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_6+" = '"+Pyt2+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_24+" = '"+Czas+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieTrzecie(String Pyt3K, String Pyt3W, String Pyt3M){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_7+" = '"+Pyt3K+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_8+" = '"+Pyt3W+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_9+" = '"+Pyt3M+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieCzwarteB(String Pyt4W, String Pyt4M){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_10+" = '"+Pyt4W+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_11+" = '"+Pyt4M+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieCzwarteC(String Pyt4K){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_12+" = '"+Pyt4K+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytaniePiate(String Pyt5){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_13+" = '"+Pyt5+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieSzoste(String Pyt6, String Pyt6I){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_14+" = '"+Pyt6+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_15+" = '"+Pyt6I+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieSiodme(String Pyt7, String Pyt7N){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_16+" = '"+Pyt7+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_17+" = '"+Pyt7N+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieOsme(String Pyt8, String Pyt8I, String Pyt9) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE " + TABLE_NAME + " set " + COL_18 + " = '" + Pyt8 + "' WHERE " + COL_4 + " = (SELECT MAX(" + COL_4 + ") FROM " + TABLE_NAME + ")");
        db.execSQL("UPDATE " + TABLE_NAME + " set " + COL_19 + " = '" + Pyt8I + "' WHERE " + COL_4 + " = (SELECT MAX(" + COL_4 + ") FROM " + TABLE_NAME + ")");
        db.execSQL("UPDATE " + TABLE_NAME + " set " + COL_20 + " = '" + Pyt9 + "' WHERE " + COL_4 + " = (SELECT MAX(" + COL_4 + ") FROM " + TABLE_NAME + ")");
        return true;
    }

    public boolean UpadatePytanieDziesiate(String Pyt10, String Pyt10I){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_21+" = '"+Pyt10+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_22+" = '"+Pyt10I+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieJedenaste(String Pyt11OdpI, String Pyt11I){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_23+" = '"+Pyt11OdpI+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_28+" = '"+Pyt11I+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieDwunaste(String Pyt12){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_29+" = '"+Pyt12+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieTrzynaste(String Pyt13){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_30+" = '"+Pyt13+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieCzternaste(String Pyt14, String Pyt14I){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_31+" = '"+Pyt14+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_32+" = '"+Pyt14I+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytaniePietnaste(String Pyt15OdpI, String Pyt15OdpII, String Pyt16){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_33+" = '"+Pyt15OdpI+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_34+" = '"+Pyt15OdpII+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_38+" = '"+Pyt16+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieSiedemnaste(String Pyt17, String Pyt17I){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_39+" = '"+Pyt17+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_40+" = '"+Pyt17I+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieOsiemnaste(String Pyt18, String Pyt18I){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_41+" = '"+Pyt18+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_44+" = '"+Pyt18I+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieDziewietnaste(String Pyt19, String Pyt19I){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_45+" = '"+Pyt19+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_50+" = '"+Pyt19I+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieDwudzieste(String Pyt20, String Pyt20I){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_51+" = '"+Pyt20+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_60+" = '"+Pyt20I+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieDwudziestePierwsze(String Pyt21){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_61+" = '"+Pyt21+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieDwudziesteDrugie(String Pyt22OdpI, String Pyt22OdpII, String Pyt22OdpIII, String Pyt22OdpIV, String Pyt22OdpV, String Pyt22OdpVI,
                                                  String Pyt22OdpVII, String Pyt22OdpVIII, String Pyt22OdpIX, String Pyt22OdpX, String Pyt22OdpXI, String Pyt22OdpXII,
                                                  String Pyt22OdpXIII, String Pyt22OdpXIV){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_62+" = '"+Pyt22OdpI+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_63+" = '"+Pyt22OdpII+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_64+" = '"+Pyt22OdpIII+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_65+" = '"+Pyt22OdpIV+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_66+" = '"+Pyt22OdpV+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_67+" = '"+Pyt22OdpVI+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_68+" = '"+Pyt22OdpVII+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_69+" = '"+Pyt22OdpVIII+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_70+" = '"+Pyt22OdpIX+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_71+" = '"+Pyt22OdpX+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_72+" = '"+Pyt22OdpXI+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_73+" = '"+Pyt22OdpXII+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_74+" = '"+Pyt22OdpXIII+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_75+" = '"+Pyt22OdpXIV+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieDwudziesteTrzecie(String Pyt23, String Pyt24, String Pyt25){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_76+" = '"+Pyt23+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_77+" = '"+Pyt24+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_78+" = '"+Pyt25+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieDwudziesteSzoste(String Pyt26, String Pyt26I){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_79+" = '"+Pyt26+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_86+" = '"+Pyt26I+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieDwudziesteSiodme(String Pyt27){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_87+" = '"+Pyt27+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieDwudziesteOsme(String Pyt28){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_88+" = '"+Pyt28+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieDwudziesteDziewiate(String Pyt29, String Pyt29I, String Pyt30, String Pyt31){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_89+" = '"+Pyt29+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_90+" = '"+Pyt29I+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_91+" = '"+Pyt30+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_92+" = '"+Pyt31+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadatePytanieTrzydziesteDrugie(String Pyt32, String Pyt32I, String Pyt33, String Pyt33I){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_93+" = '"+Pyt32+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_95+" = '"+Pyt32I+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_94+" = '"+Pyt33+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_96+" = '"+Pyt33I+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }

    public boolean UpadateMetryczka(String M1, String M2, String M3, String M4, String M5, String Czas){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_97+" = '"+M1+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_98+" = '"+M2+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_99+" = '"+M3+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_100+" = '"+M4+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_101+" = '"+M5+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        db.execSQL("UPDATE "+TABLE_NAME+" set "+COL_25+" = '"+Czas+"' WHERE "+COL_4+" = (SELECT MAX("+COL_4+") FROM "+TABLE_NAME+")");
        return true;
    }
}