public class KEY_OUT {
    public short[] KEY_OUTPUT(short[] key_state, short[] Rcon_1){
        short [] k_r = new short[4];
        short [] key_1 = new short[16];
        REG_OUT reg_out = new REG_OUT();
        k_r[0] = reg_out.register_out(key_state[13]);
        k_r[1] = reg_out.register_out(key_state[14]);
        k_r[2] = reg_out.register_out(key_state[15]);
        k_r[3] = reg_out.register_out(key_state[12]);
        for (byte i = 0; i < 4; i++) {
            key_1[i] = (short) (k_r[i] ^ key_state[i] ^ Rcon_1[i]);
        }
        for (byte i = 4; i < 16; i++) {
            key_1[i] = (short) (key_1[i-4] ^ key_state[i]);
        }
        return key_1;
}
}
