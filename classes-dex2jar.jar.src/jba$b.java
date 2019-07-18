import android.os.IBinder;
import android.os.IInterface;

final class jba$b
  implements IInterface
{
  private final IBinder a;
  
  public jba$b(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public boolean a()
    throws android.os.RemoteException
  {
    // Byte code:
    //   0: invokestatic 30	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 30	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: iconst_0
    //   9: istore_3
    //   10: aload_1
    //   11: ldc 32
    //   13: invokevirtual 36	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: aload_1
    //   17: iconst_1
    //   18: invokevirtual 40	android/os/Parcel:writeInt	(I)V
    //   21: aload_0
    //   22: getfield 18	jba$b:a	Landroid/os/IBinder;
    //   25: iconst_2
    //   26: aload_1
    //   27: aload_2
    //   28: iconst_0
    //   29: invokeinterface 46 5 0
    //   34: pop
    //   35: aload_2
    //   36: invokevirtual 49	android/os/Parcel:readException	()V
    //   39: aload_2
    //   40: invokevirtual 53	android/os/Parcel:readInt	()I
    //   43: istore 4
    //   45: iload 4
    //   47: ifeq +27 -> 74
    //   50: iconst_1
    //   51: istore_3
    //   52: goto +22 -> 74
    //   55: astore 5
    //   57: goto +27 -> 84
    //   60: astore 5
    //   62: invokestatic 59	Naa:e	()LXaa;
    //   65: ldc 61
    //   67: ldc 63
    //   69: invokeinterface 69 3 0
    //   74: aload_2
    //   75: invokevirtual 72	android/os/Parcel:recycle	()V
    //   78: aload_1
    //   79: invokevirtual 72	android/os/Parcel:recycle	()V
    //   82: iload_3
    //   83: ireturn
    //   84: aload_2
    //   85: invokevirtual 72	android/os/Parcel:recycle	()V
    //   88: aload_1
    //   89: invokevirtual 72	android/os/Parcel:recycle	()V
    //   92: aload 5
    //   94: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	this	b
    //   3	86	1	localParcel1	android.os.Parcel
    //   7	78	2	localParcel2	android.os.Parcel
    //   9	74	3	bool	boolean
    //   43	3	4	i	int
    //   55	1	5	localObject	Object
    //   60	33	5	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   10	45	55	finally
    //   62	74	55	finally
    //   10	45	60	java/lang/Exception
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
  
  /* Error */
  public String getId()
    throws android.os.RemoteException
  {
    // Byte code:
    //   0: invokestatic 30	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 30	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: aload_1
    //   9: ldc 32
    //   11: invokevirtual 36	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 18	jba$b:a	Landroid/os/IBinder;
    //   18: iconst_1
    //   19: aload_1
    //   20: aload_2
    //   21: iconst_0
    //   22: invokeinterface 46 5 0
    //   27: pop
    //   28: aload_2
    //   29: invokevirtual 49	android/os/Parcel:readException	()V
    //   32: aload_2
    //   33: invokevirtual 80	android/os/Parcel:readString	()Ljava/lang/String;
    //   36: astore_3
    //   37: aload_2
    //   38: invokevirtual 72	android/os/Parcel:recycle	()V
    //   41: aload_1
    //   42: invokevirtual 72	android/os/Parcel:recycle	()V
    //   45: goto +30 -> 75
    //   48: astore_3
    //   49: goto +28 -> 77
    //   52: astore_3
    //   53: invokestatic 59	Naa:e	()LXaa;
    //   56: ldc 61
    //   58: ldc 82
    //   60: invokeinterface 69 3 0
    //   65: aload_2
    //   66: invokevirtual 72	android/os/Parcel:recycle	()V
    //   69: aload_1
    //   70: invokevirtual 72	android/os/Parcel:recycle	()V
    //   73: aconst_null
    //   74: astore_3
    //   75: aload_3
    //   76: areturn
    //   77: aload_2
    //   78: invokevirtual 72	android/os/Parcel:recycle	()V
    //   81: aload_1
    //   82: invokevirtual 72	android/os/Parcel:recycle	()V
    //   85: aload_3
    //   86: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	b
    //   3	79	1	localParcel1	android.os.Parcel
    //   7	71	2	localParcel2	android.os.Parcel
    //   36	1	3	str1	String
    //   48	1	3	localObject	Object
    //   52	1	3	localException	Exception
    //   74	12	3	str2	String
    // Exception table:
    //   from	to	target	type
    //   8	37	48	finally
    //   53	65	48	finally
    //   8	37	52	java/lang/Exception
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jba$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */