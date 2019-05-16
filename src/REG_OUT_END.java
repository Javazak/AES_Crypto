public class REG_OUT_END {
    public short[] Change_Bytes(short [] ASCII){
        short [] Reg_State = new short[16];
        REG_OUT reg_out = new REG_OUT();
        for (byte i = 0; i < 16; i++){
            Reg_State[i] = reg_out.register_out(ASCII[i]);
        }
        return  Reg_State;
    }
    public short[] Shift_Bytes(short [] ASCII){
        short [] Reg_State = new short[16];
        Reg_State[0] = ASCII[0];
        Reg_State[1] = ASCII[5];
        Reg_State[2] = ASCII[10];
        Reg_State[3] = ASCII[15];
        Reg_State[4] = ASCII[4];
        Reg_State[5] = ASCII[9];
        Reg_State[6] = ASCII[14];
        Reg_State[7] = ASCII[3];
        Reg_State[8] = ASCII[8];
        Reg_State[9] = ASCII[13];
        Reg_State[10] = ASCII[2];
        Reg_State[11] = ASCII[7];
        Reg_State[12] = ASCII[12];
        Reg_State[13] = ASCII[1];
        Reg_State[14] = ASCII[6];
        Reg_State[15] = ASCII[11];
        return Reg_State;
    }
    public short[] Mul_Column(short [] ASCII, short [] T_1, short [] T_2, short [] T_3, short [] T_4){
        short [] Reg_State = new short[16];
        Reg_State[0] = (short) (ASCII[0] & T_1[0] ^ ASCII[1] & T_1[1] ^ ASCII[2] & T_1[2] ^ ASCII[3] & T_1[3]);
        Reg_State[1] = (short) (ASCII[0] & T_2[0] ^ ASCII[1] & T_2[1] ^ ASCII[2] & T_2[2] ^ ASCII[3] & T_2[3]);
        Reg_State[2] = (short) (ASCII[0] & T_3[0] ^ ASCII[1] & T_3[1] ^ ASCII[2] & T_3[2] ^ ASCII[3] & T_3[3]);
        Reg_State[3] = (short) (ASCII[0] & T_4[0] ^ ASCII[1] & T_4[1] ^ ASCII[2] & T_4[2] ^ ASCII[3] & T_4[3]);
        Reg_State[4] = (short) (ASCII[4] & T_1[0] ^ ASCII[5] & T_1[1] ^ ASCII[6] & T_1[2] ^ ASCII[7] & T_1[3]);
        Reg_State[5] = (short) (ASCII[4] & T_2[0] ^ ASCII[5] & T_2[1] ^ ASCII[6] & T_2[2] ^ ASCII[7] & T_2[3]);
        Reg_State[6] = (short) (ASCII[4] & T_3[0] ^ ASCII[5] & T_3[1] ^ ASCII[6] & T_3[2] ^ ASCII[7] & T_3[3]);
        Reg_State[7] = (short) (ASCII[4] & T_4[0] ^ ASCII[5] & T_4[1] ^ ASCII[6] & T_4[2] ^ ASCII[7] & T_4[3]);
        Reg_State[8] = (short) (ASCII[8] & T_1[0] ^ ASCII[9] & T_1[1] ^ ASCII[10] & T_1[2] ^ ASCII[11] & T_1[3]);
        Reg_State[9] = (short) (ASCII[8] & T_2[0] ^ ASCII[9] & T_2[1] ^ ASCII[10] & T_2[2] ^ ASCII[11] & T_2[3]);
        Reg_State[10] = (short) (ASCII[8] & T_3[0] ^ ASCII[9] & T_3[1] ^ ASCII[10] & T_3[2] ^ ASCII[11] & T_3[3]);
        Reg_State[11] = (short) (ASCII[8] & T_4[0] ^ ASCII[9] & T_4[1] ^ ASCII[10] & T_4[2] ^ ASCII[11] & T_4[3]);
        Reg_State[12] = (short) (ASCII[12] & T_1[0] ^ ASCII[13] & T_1[1] ^ ASCII[14] & T_1[2] ^ ASCII[15] & T_1[3]);
        Reg_State[13] = (short) (ASCII[12] & T_2[0] ^ ASCII[13] & T_2[1] ^ ASCII[14] & T_2[2] ^ ASCII[15] & T_2[3]);
        Reg_State[14] = (short) (ASCII[12] & T_3[0] ^ ASCII[13] & T_3[1] ^ ASCII[14] & T_3[2] ^ ASCII[15] & T_3[3]);
        Reg_State[15] = (short) (ASCII[12] & T_4[0] ^ ASCII[13] & T_4[1] ^ ASCII[14] & T_4[2] ^ ASCII[15] & T_4[3]);
        return Reg_State;
    }
    public short[] Add_Key(short [] ASCII, short [] Key_1){
        short [] Reg_Out = new short[16];
        for (byte i = 0; i < 16; i++){
            Reg_Out[i] = (short) (ASCII[i] ^ Key_1[i]);
        }
        return Reg_Out;
    }
}
