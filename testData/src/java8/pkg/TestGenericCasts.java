package pkg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

public class TestGenericCasts<T> {

  public <V extends T> void test(V v) {
    List<V> list = new ArrayList<>();
    List<? extends T> list2 = new ArrayList<>();
    List<T> list3 = new ArrayList<>();

    if (v != null) {
      list2 = list;
    }

    V v1 = list.get(0);
    T v2 = list2.get(0);

    list3.add(list2.get(0));

  }

//  interface Property<T> {
//    String getName(T value);
//  }
//
//
//  public static <T extends Comparable<T>> String getPropertyName(Property<T> property, Object value) {
//    return property.getName((T) value);
//  }
//
//  public class TestGenericArrays<T extends Number> {
//    public final T[] arr;
//    public final T[][] multi;
//
//    public TestGenericArrays(int i) {
//      this.arr = (T[]) new Number[i];// 8
//      this.multi = (T[][]) new Number[i][];// 9
//    }// 10
//  }
//
//
//  public <T extends Enum<T>> T readEnum(Class<T> enumClass) {
//    return enumClass.getEnumConstants()[1];
//  }
//
////  public <T extends Enum<T>> T[] readEnumV(Class<T> enumClass) {
////      return enumClass.getEnumConstants();
////  }
//////
////  public interface MetadataSectionType<T> {
////
////  }
////
////  public <T> T getMetadataSection(MetadataSectionType<T> type) throws Exception {
////    Object var4 = null;
////    System.out.println(var4);
////
////    return (T)var4;
////  }

}