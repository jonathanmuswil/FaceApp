import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class oya
{
  public static final float a(PointF paramPointF)
  {
    oXa.b(paramPointF, "$this$deg");
    return paramPointF.y;
  }
  
  public static final float a(Bundle paramBundle, pya parampya)
  {
    oXa.b(paramBundle, "$this$getValue");
    oXa.b(parampya, "range");
    return paramBundle.getFloat(parampya.h(), parampya.b());
  }
  
  /* Error */
  public static final Bitmap a(Bitmap paramBitmap, float paramFloat1, float paramFloat2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 44
    //   3: invokestatic 14	oXa:b	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aconst_null
    //   7: astore_3
    //   8: aconst_null
    //   9: astore 4
    //   11: aload_0
    //   12: aload_0
    //   13: invokevirtual 50	android/graphics/Bitmap:getWidth	()I
    //   16: i2f
    //   17: fload_1
    //   18: fmul
    //   19: f2i
    //   20: aload_0
    //   21: invokevirtual 53	android/graphics/Bitmap:getHeight	()I
    //   24: i2f
    //   25: fload_1
    //   26: fmul
    //   27: f2i
    //   28: iconst_1
    //   29: invokestatic 57	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   32: astore 5
    //   34: getstatic 63	io/faceapp/FaceApplication:d	Lio/faceapp/FaceApplication$a;
    //   37: invokevirtual 68	io/faceapp/FaceApplication$a:a	()Landroid/content/Context;
    //   40: invokestatic 74	android/renderscript/RenderScript:create	(Landroid/content/Context;)Landroid/renderscript/RenderScript;
    //   43: astore 6
    //   45: aload 6
    //   47: aload 5
    //   49: getstatic 80	android/renderscript/Allocation$MipmapControl:MIPMAP_NONE	Landroid/renderscript/Allocation$MipmapControl;
    //   52: iconst_1
    //   53: invokestatic 86	android/renderscript/Allocation:createFromBitmap	(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;Landroid/renderscript/Allocation$MipmapControl;I)Landroid/renderscript/Allocation;
    //   56: astore 7
    //   58: aload 4
    //   60: astore_0
    //   61: aload 6
    //   63: aload 5
    //   65: invokestatic 89	android/renderscript/Allocation:createFromBitmap	(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;)Landroid/renderscript/Allocation;
    //   68: astore 4
    //   70: aload 4
    //   72: astore_0
    //   73: aload 6
    //   75: aload 6
    //   77: invokestatic 95	android/renderscript/Element:U8_4	(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;
    //   80: invokestatic 100	android/renderscript/ScriptIntrinsicBlur:create	(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicBlur;
    //   83: astore_3
    //   84: aload 4
    //   86: astore_0
    //   87: aload_3
    //   88: fload_2
    //   89: invokevirtual 104	android/renderscript/ScriptIntrinsicBlur:setRadius	(F)V
    //   92: aload 4
    //   94: astore_0
    //   95: aload_3
    //   96: aload 7
    //   98: invokevirtual 108	android/renderscript/ScriptIntrinsicBlur:setInput	(Landroid/renderscript/Allocation;)V
    //   101: aload 4
    //   103: astore_0
    //   104: aload_3
    //   105: aload 4
    //   107: invokevirtual 111	android/renderscript/ScriptIntrinsicBlur:forEach	(Landroid/renderscript/Allocation;)V
    //   110: aload 4
    //   112: astore_0
    //   113: aload_3
    //   114: invokevirtual 115	android/renderscript/ScriptIntrinsicBlur:destroy	()V
    //   117: aload 4
    //   119: astore_0
    //   120: aload 4
    //   122: aload 5
    //   124: invokevirtual 119	android/renderscript/Allocation:copyTo	(Landroid/graphics/Bitmap;)V
    //   127: aload 4
    //   129: astore_0
    //   130: aload 5
    //   132: ldc 121
    //   134: invokestatic 123	oXa:a	(Ljava/lang/Object;Ljava/lang/String;)V
    //   137: aload 4
    //   139: ifnull +8 -> 147
    //   142: aload 4
    //   144: invokevirtual 124	android/renderscript/Allocation:destroy	()V
    //   147: aload 7
    //   149: ifnull +8 -> 157
    //   152: aload 7
    //   154: invokevirtual 124	android/renderscript/Allocation:destroy	()V
    //   157: aload 6
    //   159: ifnull +8 -> 167
    //   162: aload 6
    //   164: invokevirtual 125	android/renderscript/RenderScript:destroy	()V
    //   167: aload 5
    //   169: areturn
    //   170: astore 4
    //   172: aload_0
    //   173: astore_3
    //   174: aload 7
    //   176: astore_0
    //   177: goto +18 -> 195
    //   180: astore 4
    //   182: aconst_null
    //   183: astore_0
    //   184: goto +11 -> 195
    //   187: astore 4
    //   189: aconst_null
    //   190: astore 6
    //   192: aload 6
    //   194: astore_0
    //   195: aload_3
    //   196: ifnull +7 -> 203
    //   199: aload_3
    //   200: invokevirtual 124	android/renderscript/Allocation:destroy	()V
    //   203: aload_0
    //   204: ifnull +7 -> 211
    //   207: aload_0
    //   208: invokevirtual 124	android/renderscript/Allocation:destroy	()V
    //   211: aload 6
    //   213: ifnull +8 -> 221
    //   216: aload 6
    //   218: invokevirtual 125	android/renderscript/RenderScript:destroy	()V
    //   221: aload 4
    //   223: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	224	0	paramBitmap	Bitmap
    //   0	224	1	paramFloat1	float
    //   0	224	2	paramFloat2	float
    //   7	193	3	localObject1	Object
    //   9	134	4	localAllocation1	android.renderscript.Allocation
    //   170	1	4	localObject2	Object
    //   180	1	4	localObject3	Object
    //   187	35	4	localObject4	Object
    //   32	136	5	localBitmap	Bitmap
    //   43	174	6	localRenderScript	android.renderscript.RenderScript
    //   56	119	7	localAllocation2	android.renderscript.Allocation
    // Exception table:
    //   from	to	target	type
    //   61	70	170	finally
    //   73	84	170	finally
    //   87	92	170	finally
    //   95	101	170	finally
    //   104	110	170	finally
    //   113	117	170	finally
    //   120	127	170	finally
    //   130	137	170	finally
    //   45	58	180	finally
    //   11	45	187	finally
  }
  
  public static final Bitmap a(Bitmap paramBitmap, RectF paramRectF)
  {
    oXa.b(paramBitmap, "bitmap");
    oXa.b(paramRectF, "rect");
    RectF localRectF = new RectF(0.0F, 0.0F, 1.0F, 1.0F);
    localRectF.intersect(paramRectF);
    paramRectF = a(localRectF, UPa.a(paramBitmap));
    paramBitmap = Bitmap.createBitmap(paramBitmap, paramRectF.left, paramRectF.top, paramRectF.width(), paramRectF.height());
    oXa.a(paramBitmap, "Bitmap.createBitmap(bitm…idth(), absRect.height())");
    return paramBitmap;
  }
  
  public static final Rect a(Bitmap paramBitmap)
  {
    oXa.b(paramBitmap, "$this$getAbsRect");
    return new Rect(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
  }
  
  public static final Rect a(RectF paramRectF, APa paramAPa)
  {
    oXa.b(paramRectF, "rectf");
    oXa.b(paramAPa, "size");
    return new Rect((int)(paramRectF.left * paramAPa.c()), (int)(paramRectF.top * paramAPa.b()), (int)(paramRectF.right * paramAPa.c()), (int)(paramRectF.bottom * paramAPa.b()));
  }
  
  public static final RectF a(Rect paramRect, APa paramAPa)
  {
    oXa.b(paramRect, "rect");
    oXa.b(paramAPa, "size");
    return new RectF(paramRect.left / paramAPa.c(), paramRect.top / paramAPa.b(), paramRect.right / paramAPa.c(), paramRect.bottom / paramAPa.b());
  }
  
  public static final Bundle a(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$background");
    return EPa.a(paramBundle, "background");
  }
  
  public static final File a(Bitmap paramBitmap, File paramFile)
  {
    oXa.b(paramBitmap, "bitmap");
    oXa.b(paramFile, "file");
    FileOutputStream localFileOutputStream = new FileOutputStream(paramFile);
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localFileOutputStream);
    localFileOutputStream.close();
    return paramFile;
  }
  
  public static final List<oxa.a> a()
  {
    return mWa.b(new oxa.a[] { new oxa.a(1, 1), new oxa.a(2, 3), new oxa.a(3, 4), new oxa.b(9, 16), new oxa.a(4, 3), new oxa.a(3, 2), new oxa.b(16, 9) });
  }
  
  public static final pxa a(Bundle paramBundle, String paramString, pxa parampxa)
  {
    oXa.b(paramBundle, "$this$getFilterSelection");
    oXa.b(paramString, "folderId");
    oXa.b(parampxa, "defValue");
    paramString = paramBundle.getParcelable(paramString);
    paramBundle = paramString;
    if (!(paramString instanceof pxa)) {
      paramBundle = null;
    }
    paramBundle = (pxa)paramBundle;
    if (paramBundle != null) {
      parampxa = paramBundle;
    }
    return parampxa;
  }
  
  public static final void a(PointF paramPointF, float paramFloat)
  {
    oXa.b(paramPointF, "$this$deg");
    paramPointF.y = paramFloat;
  }
  
  public static final void a(Bundle paramBundle, PointF paramPointF)
  {
    oXa.b(paramBundle, "$this$lightSource");
    oXa.b(paramPointF, "value");
    paramBundle.putParcelable("lightSource", paramPointF);
  }
  
  public static final void a(Bundle paramBundle, RectF paramRectF)
  {
    oXa.b(paramBundle, "$this$backRect");
    paramBundle.putParcelable("backRect", paramRectF);
  }
  
  public static final void a(Bundle paramBundle, String paramString)
  {
    oXa.b(paramBundle, "$this$backID");
    oXa.b(paramString, "value");
    paramBundle.putString("backID", paramString);
  }
  
  public static final void a(Bundle paramBundle, pya parampya, float paramFloat)
  {
    oXa.b(paramBundle, "$this$setValue");
    oXa.b(parampya, "range");
    paramBundle.putFloat(parampya.h(), paramFloat);
  }
  
  public static final void a(Bundle paramBundle, boolean paramBoolean)
  {
    oXa.b(paramBundle, "$this$editMode");
    paramBundle.putBoolean("editMode", paramBoolean);
  }
  
  public static final float b(PointF paramPointF)
  {
    oXa.b(paramPointF, "$this$dst");
    return paramPointF.x;
  }
  
  public static final Rect b(Bitmap paramBitmap, RectF paramRectF)
  {
    oXa.b(paramBitmap, "$this$getAbsRect");
    oXa.b(paramRectF, "rect");
    return a(paramRectF, UPa.a(paramBitmap));
  }
  
  public static final Bundle b()
  {
    return b(null);
  }
  
  public static final Bundle b(Bundle paramBundle)
  {
    Bundle localBundle1 = new Bundle();
    if (paramBundle != null) {
      a(localBundle1, i(paramBundle));
    }
    Bundle localBundle2 = new Bundle();
    if (paramBundle != null)
    {
      localBundle3 = d(paramBundle);
      if (localBundle3 != null) {
        localBundle2.putAll(localBundle3);
      }
    }
    localBundle1.putBundle("filters", localBundle2);
    Bundle localBundle3 = new Bundle();
    if (paramBundle != null)
    {
      localBundle2 = a(paramBundle);
      if (localBundle2 != null) {
        localBundle3.putAll(localBundle2);
      }
    }
    localBundle1.putBundle("background", localBundle3);
    localBundle3 = new Bundle();
    if (paramBundle != null)
    {
      localBundle2 = u(paramBundle);
      if (localBundle2 != null) {
        localBundle3.putAll(localBundle2);
      }
    }
    localBundle1.putBundle("tatoo", localBundle3);
    localBundle2 = new Bundle();
    if (paramBundle != null)
    {
      localBundle3 = t(paramBundle);
      if (localBundle3 != null) {
        localBundle2.putAll(localBundle3);
      }
    }
    localBundle1.putBundle("overlay", localBundle2);
    localBundle2 = new Bundle();
    if (paramBundle != null)
    {
      localBundle3 = c(paramBundle);
      if (localBundle3 != null) {
        localBundle2.putAll(localBundle3);
      }
    }
    localBundle1.putBundle("effect", localBundle2);
    localBundle2 = new Bundle();
    if (paramBundle != null)
    {
      paramBundle = v(paramBundle);
      if (paramBundle != null) {
        localBundle2.putAll(paramBundle);
      }
    }
    localBundle1.putBundle("values", localBundle2);
    return localBundle1;
  }
  
  public static final File b(Bitmap paramBitmap, File paramFile)
  {
    oXa.b(paramBitmap, "bitmap");
    oXa.b(paramFile, "file");
    FileOutputStream localFileOutputStream = new FileOutputStream(paramFile);
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localFileOutputStream);
    localFileOutputStream.close();
    return paramFile;
  }
  
  public static final Float b(Bundle paramBundle, pya parampya)
  {
    oXa.b(paramBundle, "$this$getValueOrNull");
    oXa.b(parampya, "range");
    Float localFloat = Float.valueOf(paramBundle.getFloat(parampya.h()));
    localFloat.floatValue();
    if (paramBundle.containsKey(parampya.h())) {
      paramBundle = localFloat;
    } else {
      paramBundle = null;
    }
    return paramBundle;
  }
  
  public static final void b(PointF paramPointF, float paramFloat)
  {
    oXa.b(paramPointF, "$this$dst");
    paramPointF.x = paramFloat;
  }
  
  public static final void b(Bundle paramBundle, RectF paramRectF)
  {
    oXa.b(paramBundle, "$this$cropRect");
    paramBundle.putParcelable("cropRect", paramRectF);
  }
  
  public static final void b(Bundle paramBundle, String paramString)
  {
    oXa.b(paramBundle, "$this$backURI");
    oXa.b(paramString, "value");
    paramBundle.putString("backURI", paramString);
  }
  
  public static final void b(Bundle paramBundle, boolean paramBoolean)
  {
    oXa.b(paramBundle, "$this$lensFlare");
    paramBundle.putBoolean("lensFlare", paramBoolean);
  }
  
  public static final float c(PointF paramPointF)
  {
    oXa.b(paramPointF, "$this$rad");
    return (float)3.141592653589793D * paramPointF.y / '´';
  }
  
  public static final Bundle c(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$effect");
    return EPa.a(paramBundle, "effect");
  }
  
  public static final void c(Bundle paramBundle, RectF paramRectF)
  {
    oXa.b(paramBundle, "$this$foreRect");
    paramBundle.putParcelable("foreRect", paramRectF);
  }
  
  public static final void c(Bundle paramBundle, String paramString)
  {
    oXa.b(paramBundle, "$this$effectID");
    oXa.b(paramString, "value");
    paramBundle.putString("effectID", paramString);
  }
  
  public static final void c(Bundle paramBundle, boolean paramBoolean)
  {
    oXa.b(paramBundle, "$this$withShadow");
    paramBundle.putBoolean("withShadow", paramBoolean);
  }
  
  public static final Bundle d(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$filters");
    return EPa.a(paramBundle, "filters");
  }
  
  public static final void d(Bundle paramBundle, String paramString)
  {
    oXa.b(paramBundle, "$this$overlayID");
    oXa.b(paramString, "value");
    paramBundle.putString("overlayID", paramString);
  }
  
  public static final String e(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$backID");
    paramBundle = paramBundle.getString("backID", "");
    oXa.a(paramBundle, "getString(\"backID\", \"\")");
    return paramBundle;
  }
  
  public static final void e(Bundle paramBundle, String paramString)
  {
    oXa.b(paramBundle, "$this$overlayURI");
    oXa.b(paramString, "value");
    paramBundle.putString("overlayURI", paramString);
  }
  
  public static final RectF f(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$backRect");
    Parcelable localParcelable = paramBundle.getParcelable("backRect");
    paramBundle = localParcelable;
    if (!(localParcelable instanceof RectF)) {
      paramBundle = null;
    }
    return (RectF)paramBundle;
  }
  
  public static final void f(Bundle paramBundle, String paramString)
  {
    oXa.b(paramBundle, "$this$tatooID");
    oXa.b(paramString, "value");
    paramBundle.putString("tatooID", paramString);
  }
  
  public static final String g(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$backURI");
    paramBundle = paramBundle.getString("backURI", "");
    oXa.a(paramBundle, "getString(\"backURI\", \"\")");
    return paramBundle;
  }
  
  public static final RectF h(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$cropRect");
    Parcelable localParcelable = paramBundle.getParcelable("cropRect");
    paramBundle = localParcelable;
    if (!(localParcelable instanceof RectF)) {
      paramBundle = null;
    }
    return (RectF)paramBundle;
  }
  
  public static final boolean i(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$editMode");
    return paramBundle.getBoolean("editMode", true);
  }
  
  public static final String j(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$effectID");
    paramBundle = paramBundle.getString("effectID", "");
    oXa.a(paramBundle, "getString(\"effectID\", \"\")");
    return paramBundle;
  }
  
  public static final RectF k(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$foreRect");
    Parcelable localParcelable = paramBundle.getParcelable("foreRect");
    paramBundle = localParcelable;
    if (!(localParcelable instanceof RectF)) {
      paramBundle = null;
    }
    return (RectF)paramBundle;
  }
  
  public static final boolean l(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$lensFlare");
    return paramBundle.getBoolean("lensFlare", false);
  }
  
  public static final PointF m(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$lightSource");
    Parcelable localParcelable = paramBundle.getParcelable("lightSource");
    paramBundle = localParcelable;
    if (!(localParcelable instanceof PointF)) {
      paramBundle = null;
    }
    paramBundle = (PointF)paramBundle;
    if (paramBundle == null) {
      paramBundle = new PointF();
    }
    return paramBundle;
  }
  
  public static final String n(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$overlayID");
    paramBundle = paramBundle.getString("overlayID", "");
    oXa.a(paramBundle, "getString(\"overlayID\", \"\")");
    return paramBundle;
  }
  
  public static final String o(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$overlayURI");
    paramBundle = paramBundle.getString("overlayURI", "");
    oXa.a(paramBundle, "getString(\"overlayURI\", \"\")");
    return paramBundle;
  }
  
  public static final String p(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$tatooID");
    paramBundle = paramBundle.getString("tatooID", "");
    oXa.a(paramBundle, "getString(\"tatooID\", \"\")");
    return paramBundle;
  }
  
  public static final boolean q(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$withShadow");
    return paramBundle.getBoolean("withShadow", false);
  }
  
  public static final boolean r(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$isOriginConfig");
    Object localObject1 = paramBundle.keySet();
    oXa.a(localObject1, "keySet()");
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((Iterable)localObject1).iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = paramBundle.get((String)localIterator.next());
      localObject1 = localObject2;
      if (!(localObject2 instanceof Bundle)) {
        localObject1 = null;
      }
      localObject1 = (Bundle)localObject1;
      if (localObject1 != null) {
        localArrayList.add(localObject1);
      }
    }
    boolean bool1 = localArrayList.isEmpty();
    boolean bool2 = true;
    if (bool1)
    {
      bool1 = bool2;
    }
    else
    {
      paramBundle = localArrayList.iterator();
      do
      {
        bool1 = bool2;
        if (!paramBundle.hasNext()) {
          break;
        }
      } while (((Bundle)paramBundle.next()).isEmpty());
      bool1 = false;
    }
    return bool1;
  }
  
  public static final List<String> s(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$listOfFilterIds");
    Object localObject1 = paramBundle.keySet();
    oXa.a(localObject1, "keySet()");
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((Iterable)localObject1).iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = paramBundle.get((String)localIterator.next());
      localObject1 = localObject2;
      if (!(localObject2 instanceof pxa)) {
        localObject1 = null;
      }
      localObject1 = (pxa)localObject1;
      if (localObject1 != null) {
        localArrayList.add(localObject1);
      }
    }
    paramBundle = new ArrayList(mWa.a(localArrayList, 10));
    localObject1 = localArrayList.iterator();
    while (((Iterator)localObject1).hasNext()) {
      paramBundle.add(((pxa)((Iterator)localObject1).next()).o());
    }
    return paramBundle;
  }
  
  public static final Bundle t(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$overlay");
    return EPa.a(paramBundle, "overlay");
  }
  
  public static final Bundle u(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$tatoo");
    return EPa.a(paramBundle, "tatoo");
  }
  
  public static final Bundle v(Bundle paramBundle)
  {
    oXa.b(paramBundle, "$this$values");
    return EPa.a(paramBundle, "values");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/oya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */