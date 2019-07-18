import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public class gq
{
  public static int a(int paramInt)
  {
    return paramInt & 0xFFFF;
  }
  
  public static int a(Parcel paramParcel)
  {
    return paramParcel.readInt();
  }
  
  public static Bundle a(Parcel paramParcel, int paramInt)
  {
    paramInt = s(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    Bundle localBundle = paramParcel.readBundle();
    paramParcel.setDataPosition(i + paramInt);
    return localBundle;
  }
  
  public static <T extends Parcelable> T a(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    paramInt = s(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    paramCreator = (Parcelable)paramCreator.createFromParcel(paramParcel);
    paramParcel.setDataPosition(i + paramInt);
    return paramCreator;
  }
  
  private static void a(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    paramInt1 = s(paramParcel, paramInt1);
    if (paramInt1 == paramInt2) {
      return;
    }
    String str = Integer.toHexString(paramInt1);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 46);
    localStringBuilder.append("Expected size ");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append(" got ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(" (0x");
    localStringBuilder.append(str);
    localStringBuilder.append(")");
    throw new gq.a(localStringBuilder.toString(), paramParcel);
  }
  
  private static void a(Parcel paramParcel, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 == paramInt3) {
      return;
    }
    String str = Integer.toHexString(paramInt2);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 46);
    localStringBuilder.append("Expected size ");
    localStringBuilder.append(paramInt3);
    localStringBuilder.append(" got ");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append(" (0x");
    localStringBuilder.append(str);
    localStringBuilder.append(")");
    throw new gq.a(localStringBuilder.toString(), paramParcel);
  }
  
  public static int b(Parcel paramParcel)
  {
    int i = a(paramParcel);
    int j = s(paramParcel, i);
    int k = paramParcel.dataPosition();
    if (a(i) != 20293)
    {
      localObject = String.valueOf(Integer.toHexString(i));
      if (((String)localObject).length() != 0) {
        localObject = "Expected object header. Got 0x".concat((String)localObject);
      } else {
        localObject = new String("Expected object header. Got 0x");
      }
      throw new gq.a((String)localObject, paramParcel);
    }
    i = j + k;
    if ((i >= k) && (i <= paramParcel.dataSize())) {
      return i;
    }
    Object localObject = new StringBuilder(54);
    ((StringBuilder)localObject).append("Size read is invalid start=");
    ((StringBuilder)localObject).append(k);
    ((StringBuilder)localObject).append(" end=");
    ((StringBuilder)localObject).append(i);
    throw new gq.a(((StringBuilder)localObject).toString(), paramParcel);
  }
  
  public static byte[] b(Parcel paramParcel, int paramInt)
  {
    int i = s(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    byte[] arrayOfByte = paramParcel.createByteArray();
    paramParcel.setDataPosition(paramInt + i);
    return arrayOfByte;
  }
  
  public static <T> T[] b(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    paramInt = s(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    paramCreator = paramParcel.createTypedArray(paramCreator);
    paramParcel.setDataPosition(i + paramInt);
    return paramCreator;
  }
  
  public static <T> ArrayList<T> c(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    int i = s(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    paramCreator = paramParcel.createTypedArrayList(paramCreator);
    paramParcel.setDataPosition(paramInt + i);
    return paramCreator;
  }
  
  public static byte[][] c(Parcel paramParcel, int paramInt)
  {
    int i = s(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    int k = paramParcel.readInt();
    byte[][] arrayOfByte = new byte[k][];
    for (paramInt = 0; paramInt < k; paramInt++) {
      arrayOfByte[paramInt] = paramParcel.createByteArray();
    }
    paramParcel.setDataPosition(j + i);
    return arrayOfByte;
  }
  
  public static int[] d(Parcel paramParcel, int paramInt)
  {
    int i = s(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    int[] arrayOfInt = paramParcel.createIntArray();
    paramParcel.setDataPosition(paramInt + i);
    return arrayOfInt;
  }
  
  public static ArrayList<Integer> e(Parcel paramParcel, int paramInt)
  {
    int i = s(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int k = paramParcel.readInt();
    for (paramInt = 0; paramInt < k; paramInt++) {
      localArrayList.add(Integer.valueOf(paramParcel.readInt()));
    }
    paramParcel.setDataPosition(j + i);
    return localArrayList;
  }
  
  public static String f(Parcel paramParcel, int paramInt)
  {
    paramInt = s(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    String str = paramParcel.readString();
    paramParcel.setDataPosition(i + paramInt);
    return str;
  }
  
  public static String[] g(Parcel paramParcel, int paramInt)
  {
    int i = s(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    String[] arrayOfString = paramParcel.createStringArray();
    paramParcel.setDataPosition(paramInt + i);
    return arrayOfString;
  }
  
  public static ArrayList<String> h(Parcel paramParcel, int paramInt)
  {
    paramInt = s(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    ArrayList localArrayList = paramParcel.createStringArrayList();
    paramParcel.setDataPosition(i + paramInt);
    return localArrayList;
  }
  
  public static void i(Parcel paramParcel, int paramInt)
  {
    if (paramParcel.dataPosition() == paramInt) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder(37);
    localStringBuilder.append("Overread allowed size end=");
    localStringBuilder.append(paramInt);
    throw new gq.a(localStringBuilder.toString(), paramParcel);
  }
  
  public static boolean j(Parcel paramParcel, int paramInt)
  {
    a(paramParcel, paramInt, 4);
    return paramParcel.readInt() != 0;
  }
  
  public static Boolean k(Parcel paramParcel, int paramInt)
  {
    int i = s(paramParcel, paramInt);
    if (i == 0) {
      return null;
    }
    a(paramParcel, paramInt, i, 4);
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return Boolean.valueOf(bool);
  }
  
  public static Double l(Parcel paramParcel, int paramInt)
  {
    int i = s(paramParcel, paramInt);
    if (i == 0) {
      return null;
    }
    a(paramParcel, paramInt, i, 8);
    return Double.valueOf(paramParcel.readDouble());
  }
  
  public static float m(Parcel paramParcel, int paramInt)
  {
    a(paramParcel, paramInt, 4);
    return paramParcel.readFloat();
  }
  
  public static Float n(Parcel paramParcel, int paramInt)
  {
    int i = s(paramParcel, paramInt);
    if (i == 0) {
      return null;
    }
    a(paramParcel, paramInt, i, 4);
    return Float.valueOf(paramParcel.readFloat());
  }
  
  public static IBinder o(Parcel paramParcel, int paramInt)
  {
    paramInt = s(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    IBinder localIBinder = paramParcel.readStrongBinder();
    paramParcel.setDataPosition(i + paramInt);
    return localIBinder;
  }
  
  public static int p(Parcel paramParcel, int paramInt)
  {
    a(paramParcel, paramInt, 4);
    return paramParcel.readInt();
  }
  
  public static long q(Parcel paramParcel, int paramInt)
  {
    a(paramParcel, paramInt, 8);
    return paramParcel.readLong();
  }
  
  public static Long r(Parcel paramParcel, int paramInt)
  {
    int i = s(paramParcel, paramInt);
    if (i == 0) {
      return null;
    }
    a(paramParcel, paramInt, i, 8);
    return Long.valueOf(paramParcel.readLong());
  }
  
  public static int s(Parcel paramParcel, int paramInt)
  {
    if ((paramInt & 0xFFFF0000) != -65536) {
      return paramInt >> 16 & 0xFFFF;
    }
    return paramParcel.readInt();
  }
  
  public static void t(Parcel paramParcel, int paramInt)
  {
    paramInt = s(paramParcel, paramInt);
    paramParcel.setDataPosition(paramParcel.dataPosition() + paramInt);
  }
  
  public static class a
    extends RuntimeException
  {
    public a(String paramString, Parcel paramParcel)
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */