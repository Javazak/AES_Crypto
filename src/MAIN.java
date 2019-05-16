
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class MAIN {




    public static void main(String[] args) {
        Window window = new Window();



        //Rcon i nermucum
        //*******************************************************
        final short [] Rcon1 = {0x01, 0x00, 0x00, 0x00}; //******
        final short [] Rcon2 = {0x02, 0x00, 0x00, 0x00}; //******
        final short [] Rcon3 = {0x04, 0x00, 0x00, 0x00}; //******
        final short [] Rcon4 = {0x08, 0x00, 0x00, 0x00}; //******
        final short [] Rcon5 = {0x10, 0x00, 0x00, 0x00}; //******
        final short [] Rcon6 = {0x20, 0x00, 0x00, 0x00}; //******
        final short [] Rcon7 = {0x40, 0x00, 0x00, 0x00}; //******
        final short [] Rcon8 = {0x80, 0x00, 0x00, 0x00}; //******
        final short [] Rcon9 = {0x1b, 0x00, 0x00, 0x00}; //******
        final short [] Rcon10 = {0x36, 0x00, 0x00, 0x00}; //*****
        //*******************************************************

        //T eri nermucum
        //*******************************************************
        final short [] T1 = {0x02, 0x03, 0x01, 0x01}; //*********
        final short [] T2 = {0x01, 0x02, 0x03, 0x01}; //*********
        final short [] T3 = {0x01, 0x01, 0x02, 0x03}; //*********
        final short [] T4 = {0x03, 0x01, 0x01, 0x02}; //*********
        //*******************************************************

        Scanner scanner = new Scanner(System.in);

        String [] ASCII_1_1 = new String[16];
        String [] Key_1 = new String[16];


        //Bac texti nermucum
        //*******************************************************************
        System.out.print("Ներմուծեք սկզբնական տեքստը ASCII կոդով։ "); //*****
        for (byte i = 0; i < 16; i++){                                //*****
            ASCII_1_1[i] = scanner.next();                         //*****
        }                                                             //*****
        //*******************************************************************

        //Banalu nermucum
        //******************************************************************************************************
        System.out.print("Ներմուծեք սկզբնական տեքստի կոդավորման համար անհրաժեշտ 128 կարգանի բանալին։ "); //*****
        for (byte i = 0; i < 16; i++){                                                                   //*****
            Key_1[i] = scanner.next();                                                                //*****
        }                                                                                                //*****
        //******************************************************************************************************

        short [] ASCII_1 = new short[16];
        short [] Key = new short[16];

        ASCII_CHANGE_HEX ascii_change_hex = new ASCII_CHANGE_HEX();


        for (byte i = 0; i < 16; i++) {
            ASCII_1[i] = ascii_change_hex.Ascii_change(ASCII_1_1[i]);
            Key[i] = ascii_change_hex.Ascii_change(Key_1[i]);
        }
        //Banalu avelacum himanakan textin
        //*****************************************************
        for (byte i = 0; i < 16; i++){                  //*****
            ASCII_1[i] = (short) (ASCII_1[i] ^ Key[i]); //*****
        }                                               //*****
        //*****************************************************

        KEY_OUT key_out = new KEY_OUT();
        REG_OUT_END reg_out_end = new REG_OUT_END();

        //round 1
        //****************************************************************
        Key = key_out.KEY_OUTPUT(Key, Rcon1);                      //*****
        ASCII_1 = reg_out_end.Change_Bytes(ASCII_1);               //*****
        ASCII_1 = reg_out_end.Shift_Bytes(ASCII_1);                //*****
        ASCII_1 = reg_out_end.Mul_Column(ASCII_1, T1, T2, T3, T4); //*****
        ASCII_1 = reg_out_end.Add_Key(ASCII_1, Key);               //*****
        //****************************************************************

        //round 2
        //****************************************************************
        Key = key_out.KEY_OUTPUT(Key, Rcon2);                      //*****
        ASCII_1 = reg_out_end.Change_Bytes(ASCII_1);               //*****
        ASCII_1 = reg_out_end.Shift_Bytes(ASCII_1);                //*****
        ASCII_1 = reg_out_end.Mul_Column(ASCII_1, T1, T2, T3, T4); //*****
        ASCII_1 = reg_out_end.Add_Key(ASCII_1, Key);               //*****
        //****************************************************************

        //round 3
        //****************************************************************
        Key = key_out.KEY_OUTPUT(Key, Rcon3);                      //*****
        ASCII_1 = reg_out_end.Change_Bytes(ASCII_1);               //*****
        ASCII_1 = reg_out_end.Shift_Bytes(ASCII_1);                //*****
        ASCII_1 = reg_out_end.Mul_Column(ASCII_1, T1, T2, T3, T4); //*****
        ASCII_1 = reg_out_end.Add_Key(ASCII_1, Key);               //*****
        //****************************************************************

        //round 4
        //****************************************************************
        Key = key_out.KEY_OUTPUT(Key, Rcon4);                      //*****
        ASCII_1 = reg_out_end.Change_Bytes(ASCII_1);               //*****
        ASCII_1 = reg_out_end.Shift_Bytes(ASCII_1);                //*****
        ASCII_1 = reg_out_end.Mul_Column(ASCII_1, T1, T2, T3, T4); //*****
        ASCII_1 = reg_out_end.Add_Key(ASCII_1, Key);               //*****
        //****************************************************************

        //round 5
        //****************************************************************
        Key = key_out.KEY_OUTPUT(Key, Rcon5);                      //*****
        ASCII_1 = reg_out_end.Change_Bytes(ASCII_1);               //*****
        ASCII_1 = reg_out_end.Shift_Bytes(ASCII_1);                //*****
        ASCII_1 = reg_out_end.Mul_Column(ASCII_1, T1, T2, T3, T4); //*****
        ASCII_1 = reg_out_end.Add_Key(ASCII_1, Key);               //*****
        //****************************************************************

        //round 6
        //****************************************************************
        Key = key_out.KEY_OUTPUT(Key, Rcon6);                      //*****
        ASCII_1 = reg_out_end.Change_Bytes(ASCII_1);               //*****
        ASCII_1 = reg_out_end.Shift_Bytes(ASCII_1);                //*****
        ASCII_1 = reg_out_end.Mul_Column(ASCII_1, T1, T2, T3, T4); //*****
        ASCII_1 = reg_out_end.Add_Key(ASCII_1, Key);               //*****
        //****************************************************************

        //round 7
        //****************************************************************
        Key = key_out.KEY_OUTPUT(Key, Rcon7);                      //*****
        ASCII_1 = reg_out_end.Change_Bytes(ASCII_1);               //*****
        ASCII_1 = reg_out_end.Shift_Bytes(ASCII_1);                //*****
        ASCII_1 = reg_out_end.Mul_Column(ASCII_1, T1, T2, T3, T4); //*****
        ASCII_1 = reg_out_end.Add_Key(ASCII_1, Key);               //*****
        //****************************************************************

        //round 8
        //****************************************************************
        Key = key_out.KEY_OUTPUT(Key, Rcon8);                      //*****
        ASCII_1 = reg_out_end.Change_Bytes(ASCII_1);               //*****
        ASCII_1 = reg_out_end.Shift_Bytes(ASCII_1);                //*****
        ASCII_1 = reg_out_end.Mul_Column(ASCII_1, T1, T2, T3, T4); //*****
        ASCII_1 = reg_out_end.Add_Key(ASCII_1, Key);               //*****
        //****************************************************************

        //round 9
        //****************************************************************
        Key = key_out.KEY_OUTPUT(Key, Rcon9);                      //*****
        ASCII_1 = reg_out_end.Change_Bytes(ASCII_1);               //*****
        ASCII_1 = reg_out_end.Shift_Bytes(ASCII_1);                //*****
        ASCII_1 = reg_out_end.Mul_Column(ASCII_1, T1, T2, T3, T4); //*****
        ASCII_1 = reg_out_end.Add_Key(ASCII_1, Key);               //*****
        //****************************************************************

        //round 10
        //****************************************************************
        Key = key_out.KEY_OUTPUT(Key, Rcon10);                     //*****
        ASCII_1 = reg_out_end.Change_Bytes(ASCII_1);               //*****
        ASCII_1 = reg_out_end.Shift_Bytes(ASCII_1);                //*****
        ASCII_1 = reg_out_end.Add_Key(ASCII_1, Key);               //*****
        //****************************************************************

        //Ardyunqi tpum
        HEX_CHANGE_ASCII hex_change_ascii = new HEX_CHANGE_ASCII();
        System.out.print("Գաղտնագրված տեքստն է։ ");
        for (byte i = 0; i < 16; i++) {
            System.out.print(hex_change_ascii.Hex_Change(ASCII_1[i]) + " ");
        }

    }


}