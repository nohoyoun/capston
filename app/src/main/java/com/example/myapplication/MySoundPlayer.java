package com.example.myapplication;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;

import java.util.HashMap;

public class MySoundPlayer {

    public static final int DING_DONG = R.raw.catfear;
    public static final int Blop_Sound = R.raw.blop_sound;

    public static final int Toy_Train_Whistle_Sound = R.raw.train_sound;
    public static final int Air_Sound = R.raw.airsound;
    public static final int Boxing_Arena_Sound = R.raw.boxing_arena_sound;
    public static final int Coin_1 = R.raw.coin_1;
    public static final int Coin_5 = R.raw.coin_5;
    public static final int Fire_Alarm_Sound = R.raw.fire_alarm_sound;
    public static final int Sell_Buy_Music_Under = R.raw.sellbuymusic_under;
    public static final int Tiny_Button_Push_Sound = R.raw.tiny_button_push_sound;
    public static final int Train_Sound = R.raw.train_sound;
    public static final int Woosh_Sound = R.raw.woosh_sound;
    public static final int Arirang = R.raw.arirang;
    public static final int Gum_Sound = R.raw.gum_bubble_pop_sound;
    public static final int Gun_Fire_Sound = R.raw.gun_fire_sound;
    public static final int Hello_Baby_Girl_Sound = R.raw.hello_baby_girl_sound;
    public static final int Pling_Sound = R.raw.pling_sound;
    public static final int Sad_Trombone_Sound = R.raw.sad_trombone_sound;
    public static final int Water_Sound = R.raw.water_sound;


    //  public static final int SUCCESS = R.raw.success;

    private static SoundPool soundPool;
    private static HashMap<Integer, Integer> soundPoolMap;

    // sound media initialize
    public static void initSounds(Context context) {
        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        soundPool = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();

        soundPoolMap = new HashMap(2);
        soundPoolMap.put(DING_DONG, soundPool.load(context, DING_DONG, 1));
        soundPoolMap.put(Blop_Sound, soundPool.load(context, Blop_Sound, 1));
        soundPoolMap.put(Air_Sound, soundPool.load(context, Air_Sound, 1));
        soundPoolMap.put(Boxing_Arena_Sound, soundPool.load(context, Boxing_Arena_Sound, 1));
        soundPoolMap.put(Coin_1, soundPool.load(context, Coin_1, 1));
        soundPoolMap.put(Coin_5, soundPool.load(context, Coin_5, 1));
        soundPoolMap.put(Fire_Alarm_Sound, soundPool.load(context, Fire_Alarm_Sound, 1));
        soundPoolMap.put(Sell_Buy_Music_Under, soundPool.load(context, Sell_Buy_Music_Under, 1));
        soundPoolMap.put(Tiny_Button_Push_Sound, soundPool.load(context, Tiny_Button_Push_Sound, 1));
        soundPoolMap.put(Train_Sound, soundPool.load(context, Train_Sound, 1));
        soundPoolMap.put(Woosh_Sound, soundPool.load(context, Woosh_Sound, 1));
        soundPoolMap.put(Arirang, soundPool.load(context, Arirang, 1));
        soundPoolMap.put(Gum_Sound, soundPool.load(context, Gum_Sound, 1));
        soundPoolMap.put(Gun_Fire_Sound, soundPool.load(context, Gun_Fire_Sound, 1));
        soundPoolMap.put(Hello_Baby_Girl_Sound, soundPool.load(context, Hello_Baby_Girl_Sound, 1));
        soundPoolMap.put(Pling_Sound, soundPool.load(context, Pling_Sound, 1));
        soundPoolMap.put(Sad_Trombone_Sound, soundPool.load(context, Sad_Trombone_Sound, 1));
        soundPoolMap.put(Water_Sound, soundPool.load(context, Water_Sound, 1));

       // soundPoolMap.put(SUCCESS, soundPool.load(context, SUCCESS, 2));
    }



    public static void play(int raw_id){
        if( soundPoolMap.containsKey(raw_id) ) {
            soundPool.play(soundPoolMap.get(raw_id), 1, 1, 1, 0, 1f);
        }
    }
}
