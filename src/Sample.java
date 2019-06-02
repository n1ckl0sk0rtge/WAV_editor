public class Sample {
    //Membervariablen
    private byte[] _data;
    private int _size;
    private int _channel;


    public Sample(int size, byte[] data){
        this._size = size;
        this._data = data;
    }


    public int get_size() {
        return _size;
    }

    public byte[] get_data() {
        return _data;
    }

    public int get_channel() {
        return _channel;
    }

    public byte[] get_bytes_of_channel_i(int _channel, int Number_of_Channels_in_WAVE){
        byte[] b = new byte[0];
        if (_channel > 0 && _channel <= Number_of_Channels_in_WAVE){
            int index = (_channel-1)*(_data.length / Number_of_Channels_in_WAVE);
            b = new byte[_data.length/Number_of_Channels_in_WAVE];
            for (int i=index; i < index+(_data.length/Number_of_Channels_in_WAVE);i++){
                b[i-index] = _data[i];
            }
        } else {
            System.out.println("Kein gültiger Channel: " + _channel);
        }
        return b;
    }


    public void set_data(byte[] data){
        this._data = data;
    }

}
