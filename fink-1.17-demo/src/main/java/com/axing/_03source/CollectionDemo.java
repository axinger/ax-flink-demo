package com.axing._03source;

import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.util.Arrays;


public class CollectionDemo {

    public static void main(String[] args) throws Exception {


        StreamExecutionEnvironment env = StreamExecutionEnvironment
                .getExecutionEnvironment();


        DataStreamSource<Integer> source = env
//                .fromCollection(Arrays.asList(1, 22, 33))
                .fromElements(1,22,33)
                ;

        source.print();
        env.execute();
    }
}
