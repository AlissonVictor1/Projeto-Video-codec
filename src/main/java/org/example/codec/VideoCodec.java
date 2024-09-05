package org.example.codec;
import  java.util.ArrayList;
import java.util.List;
public class VideoCodec {
    private List<VideoClip> clips;        // Lista de clipes de vídeo;
    public VideoCodec(){
        // Construtor que inicializa as listas
        clips = new ArrayList<>();}
    public void addClip(VideoClip clip){ //clip porque se refere a um. O arquivo.
        clips.add(clip);
        // Esse metodo adiciona um clip de vídeo à lista utilizando clips.add (a biblioteca do java.util)
}}
