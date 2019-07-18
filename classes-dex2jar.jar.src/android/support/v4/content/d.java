package android.support.v4.content;

import Hc;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public class d
  extends a<Cursor>
{
  final e<Cursor>.a p = new e.a(this);
  Uri q;
  String[] r;
  String s;
  String[] t;
  String u;
  Cursor v;
  Hc w;
  
  public d(Context paramContext, Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    super(paramContext);
    this.q = paramUri;
    this.r = paramArrayOfString1;
    this.s = paramString1;
    this.t = paramArrayOfString2;
    this.u = paramString2;
  }
  
  public void a(Cursor paramCursor)
  {
    if (i())
    {
      if (paramCursor != null) {
        paramCursor.close();
      }
      return;
    }
    Cursor localCursor = this.v;
    this.v = paramCursor;
    if (j()) {
      super.b(paramCursor);
    }
    if ((localCursor != null) && (localCursor != paramCursor) && (!localCursor.isClosed())) {
      localCursor.close();
    }
  }
  
  @Deprecated
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mUri=");
    paramPrintWriter.println(this.q);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mProjection=");
    paramPrintWriter.println(Arrays.toString(this.r));
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mSelection=");
    paramPrintWriter.println(this.s);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mSelectionArgs=");
    paramPrintWriter.println(Arrays.toString(this.t));
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mSortOrder=");
    paramPrintWriter.println(this.u);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mCursor=");
    paramPrintWriter.println(this.v);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mContentChanged=");
    paramPrintWriter.println(this.h);
  }
  
  public void b(Cursor paramCursor)
  {
    if ((paramCursor != null) && (!paramCursor.isClosed())) {
      paramCursor.close();
    }
  }
  
  protected void o()
  {
    super.o();
    q();
    Cursor localCursor = this.v;
    if ((localCursor != null) && (!localCursor.isClosed())) {
      this.v.close();
    }
    this.v = null;
  }
  
  protected void p()
  {
    Cursor localCursor = this.v;
    if (localCursor != null) {
      a(localCursor);
    }
    if ((v()) || (this.v == null)) {
      f();
    }
  }
  
  protected void q()
  {
    c();
  }
  
  public void w()
  {
    super.w();
    try
    {
      if (this.w != null) {
        this.w.a();
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public Cursor z()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 144	android/support/v4/content/a:y	()Z
    //   6: ifne +119 -> 125
    //   9: new 135	Hc
    //   12: astore_1
    //   13: aload_1
    //   14: invokespecial 146	Hc:<init>	()V
    //   17: aload_0
    //   18: aload_1
    //   19: putfield 133	android/support/v4/content/d:w	LHc;
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_0
    //   25: invokevirtual 150	android/support/v4/content/e:g	()Landroid/content/Context;
    //   28: invokevirtual 156	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   31: aload_0
    //   32: getfield 34	android/support/v4/content/d:q	Landroid/net/Uri;
    //   35: aload_0
    //   36: getfield 36	android/support/v4/content/d:r	[Ljava/lang/String;
    //   39: aload_0
    //   40: getfield 38	android/support/v4/content/d:s	Ljava/lang/String;
    //   43: aload_0
    //   44: getfield 40	android/support/v4/content/d:t	[Ljava/lang/String;
    //   47: aload_0
    //   48: getfield 42	android/support/v4/content/d:u	Ljava/lang/String;
    //   51: aload_0
    //   52: getfield 133	android/support/v4/content/d:w	LHc;
    //   55: invokestatic 161	android/support/v4/content/b:a	(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;LHc;)Landroid/database/Cursor;
    //   58: astore_2
    //   59: aload_2
    //   60: ifnull +32 -> 92
    //   63: aload_2
    //   64: invokeinterface 165 1 0
    //   69: pop
    //   70: aload_2
    //   71: aload_0
    //   72: getfield 32	android/support/v4/content/d:p	Landroid/support/v4/content/e$a;
    //   75: invokeinterface 169 2 0
    //   80: goto +12 -> 92
    //   83: astore_1
    //   84: aload_2
    //   85: invokeinterface 57 1 0
    //   90: aload_1
    //   91: athrow
    //   92: aload_0
    //   93: monitorenter
    //   94: aload_0
    //   95: aconst_null
    //   96: putfield 133	android/support/v4/content/d:w	LHc;
    //   99: aload_0
    //   100: monitorexit
    //   101: aload_2
    //   102: areturn
    //   103: astore_1
    //   104: aload_0
    //   105: monitorexit
    //   106: aload_1
    //   107: athrow
    //   108: astore_1
    //   109: aload_0
    //   110: monitorenter
    //   111: aload_0
    //   112: aconst_null
    //   113: putfield 133	android/support/v4/content/d:w	LHc;
    //   116: aload_0
    //   117: monitorexit
    //   118: aload_1
    //   119: athrow
    //   120: astore_1
    //   121: aload_0
    //   122: monitorexit
    //   123: aload_1
    //   124: athrow
    //   125: new 171	Kc
    //   128: astore_1
    //   129: aload_1
    //   130: invokespecial 172	Kc:<init>	()V
    //   133: aload_1
    //   134: athrow
    //   135: astore_1
    //   136: aload_0
    //   137: monitorexit
    //   138: aload_1
    //   139: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	140	0	this	d
    //   12	7	1	localHc	Hc
    //   83	8	1	localRuntimeException	RuntimeException
    //   103	4	1	localObject1	Object
    //   108	11	1	localObject2	Object
    //   120	4	1	localObject3	Object
    //   128	6	1	localKc	Kc
    //   135	4	1	localObject4	Object
    //   58	44	2	localCursor	Cursor
    // Exception table:
    //   from	to	target	type
    //   63	80	83	java/lang/RuntimeException
    //   94	101	103	finally
    //   104	106	103	finally
    //   24	59	108	finally
    //   63	80	108	finally
    //   84	92	108	finally
    //   111	118	120	finally
    //   121	123	120	finally
    //   2	24	135	finally
    //   125	135	135	finally
    //   136	138	135	finally
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/content/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */