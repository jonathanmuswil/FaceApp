package com.google.android.gms.dynamite;

import Iq;
import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule
{
  private static Boolean a;
  private static i b;
  private static k c;
  private static String d;
  private static int e = -1;
  private static final ThreadLocal<c> f = new ThreadLocal();
  private static final DynamiteModule.b.a g = new a();
  public static final b h = new b();
  public static final b i = new c();
  public static final b j = new d();
  public static final b k = new e();
  public static final b l = new f();
  private static final b m = new g();
  private final Context n;
  
  private DynamiteModule(Context paramContext)
  {
    t.a(paramContext);
    this.n = ((Context)paramContext);
  }
  
  public static int a(Context paramContext, String paramString)
  {
    try
    {
      Object localObject = paramContext.getApplicationContext().getClassLoader();
      int i1 = String.valueOf(paramString).length();
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>(i1 + 61);
      paramContext.append("com.google.android.gms.dynamite.descriptors.");
      paramContext.append(paramString);
      paramContext.append(".ModuleDescriptor");
      localObject = ((ClassLoader)localObject).loadClass(paramContext.toString());
      paramContext = ((Class)localObject).getDeclaredField("MODULE_ID");
      localObject = ((Class)localObject).getDeclaredField("MODULE_VERSION");
      if (!paramContext.get(null).equals(paramString))
      {
        localObject = String.valueOf(paramContext.get(null));
        int i2 = String.valueOf(localObject).length();
        i1 = String.valueOf(paramString).length();
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>(i2 + 51 + i1);
        paramContext.append("Module descriptor id '");
        paramContext.append((String)localObject);
        paramContext.append("' didn't match expected id '");
        paramContext.append(paramString);
        paramContext.append("'");
        Log.e("DynamiteModule", paramContext.toString());
        return 0;
      }
      i1 = ((Field)localObject).getInt(null);
      return i1;
    }
    catch (Exception paramContext)
    {
      paramContext = String.valueOf(paramContext.getMessage());
      if (paramContext.length() != 0) {
        paramContext = "Failed to load module descriptor class: ".concat(paramContext);
      } else {
        paramContext = new String("Failed to load module descriptor class: ");
      }
      Log.e("DynamiteModule", paramContext);
    }
    catch (ClassNotFoundException paramContext)
    {
      paramContext = new StringBuilder(String.valueOf(paramString).length() + 45);
      paramContext.append("Local module descriptor class for ");
      paramContext.append(paramString);
      paramContext.append(" not found.");
      Log.w("DynamiteModule", paramContext.toString());
    }
    return 0;
  }
  
  /* Error */
  public static int a(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 210	com/google/android/gms/dynamite/DynamiteModule:a	Ljava/lang/Boolean;
    //   6: astore_3
    //   7: aload_3
    //   8: astore 4
    //   10: aload_3
    //   11: ifnonnull +289 -> 300
    //   14: aload_0
    //   15: invokevirtual 109	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   18: invokevirtual 113	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   21: ldc 6
    //   23: invokevirtual 213	java/lang/Class:getName	()Ljava/lang/String;
    //   26: invokevirtual 146	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   29: astore_3
    //   30: aload_3
    //   31: ldc -41
    //   33: invokevirtual 154	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   36: astore 4
    //   38: aload_3
    //   39: monitorenter
    //   40: aload 4
    //   42: aconst_null
    //   43: invokevirtual 161	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   46: checkcast 142	java/lang/ClassLoader
    //   49: astore 5
    //   51: aload 5
    //   53: ifnull +32 -> 85
    //   56: aload 5
    //   58: invokestatic 218	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   61: if_acmpne +11 -> 72
    //   64: getstatic 223	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   67: astore 4
    //   69: goto +141 -> 210
    //   72: aload 5
    //   74: invokestatic 226	com/google/android/gms/dynamite/DynamiteModule:a	(Ljava/lang/ClassLoader;)V
    //   77: getstatic 229	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   80: astore 4
    //   82: goto +128 -> 210
    //   85: ldc -25
    //   87: aload_0
    //   88: invokevirtual 109	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   91: invokevirtual 234	android/content/Context:getPackageName	()Ljava/lang/String;
    //   94: invokevirtual 235	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   97: ifeq +20 -> 117
    //   100: aload 4
    //   102: aconst_null
    //   103: invokestatic 218	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   106: invokevirtual 239	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   109: getstatic 223	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   112: astore 4
    //   114: goto +96 -> 210
    //   117: aload_0
    //   118: aload_1
    //   119: iload_2
    //   120: invokestatic 241	com/google/android/gms/dynamite/DynamiteModule:c	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   123: istore 6
    //   125: getstatic 243	com/google/android/gms/dynamite/DynamiteModule:d	Ljava/lang/String;
    //   128: ifnull +58 -> 186
    //   131: getstatic 243	com/google/android/gms/dynamite/DynamiteModule:d	Ljava/lang/String;
    //   134: invokevirtual 247	java/lang/String:isEmpty	()Z
    //   137: ifeq +6 -> 143
    //   140: goto +46 -> 186
    //   143: new 249	com/google/android/gms/dynamite/h
    //   146: astore 5
    //   148: aload 5
    //   150: getstatic 243	com/google/android/gms/dynamite/DynamiteModule:d	Ljava/lang/String;
    //   153: invokestatic 218	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   156: invokespecial 252	com/google/android/gms/dynamite/h:<init>	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   159: aload 5
    //   161: invokestatic 226	com/google/android/gms/dynamite/DynamiteModule:a	(Ljava/lang/ClassLoader;)V
    //   164: aload 4
    //   166: aconst_null
    //   167: aload 5
    //   169: invokevirtual 239	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   172: getstatic 229	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   175: putstatic 210	com/google/android/gms/dynamite/DynamiteModule:a	Ljava/lang/Boolean;
    //   178: aload_3
    //   179: monitorexit
    //   180: ldc 2
    //   182: monitorexit
    //   183: iload 6
    //   185: ireturn
    //   186: aload_3
    //   187: monitorexit
    //   188: ldc 2
    //   190: monitorexit
    //   191: iload 6
    //   193: ireturn
    //   194: astore 5
    //   196: aload 4
    //   198: aconst_null
    //   199: invokestatic 218	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   202: invokevirtual 239	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   205: getstatic 223	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   208: astore 4
    //   210: aload_3
    //   211: monitorexit
    //   212: goto +83 -> 295
    //   215: astore 4
    //   217: aload_3
    //   218: monitorexit
    //   219: aload 4
    //   221: athrow
    //   222: astore 4
    //   224: goto +10 -> 234
    //   227: astore 4
    //   229: goto +5 -> 234
    //   232: astore 4
    //   234: aload 4
    //   236: invokestatic 119	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   239: astore_3
    //   240: aload_3
    //   241: invokestatic 119	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   244: invokevirtual 123	java/lang/String:length	()I
    //   247: istore 6
    //   249: new 125	java/lang/StringBuilder
    //   252: astore 4
    //   254: aload 4
    //   256: iload 6
    //   258: bipush 30
    //   260: iadd
    //   261: invokespecial 128	java/lang/StringBuilder:<init>	(I)V
    //   264: aload 4
    //   266: ldc -2
    //   268: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: pop
    //   272: aload 4
    //   274: aload_3
    //   275: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: pop
    //   279: ldc -83
    //   281: aload 4
    //   283: invokevirtual 140	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   286: invokestatic 201	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   289: pop
    //   290: getstatic 223	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   293: astore 4
    //   295: aload 4
    //   297: putstatic 210	com/google/android/gms/dynamite/DynamiteModule:a	Ljava/lang/Boolean;
    //   300: ldc 2
    //   302: monitorexit
    //   303: aload 4
    //   305: invokevirtual 257	java/lang/Boolean:booleanValue	()Z
    //   308: istore 7
    //   310: iload 7
    //   312: ifeq +61 -> 373
    //   315: aload_0
    //   316: aload_1
    //   317: iload_2
    //   318: invokestatic 241	com/google/android/gms/dynamite/DynamiteModule:c	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   321: istore 6
    //   323: iload 6
    //   325: ireturn
    //   326: astore_1
    //   327: aload_1
    //   328: invokevirtual 185	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   331: invokestatic 119	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   334: astore_1
    //   335: aload_1
    //   336: invokevirtual 123	java/lang/String:length	()I
    //   339: ifeq +14 -> 353
    //   342: ldc_w 259
    //   345: aload_1
    //   346: invokevirtual 191	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   349: astore_1
    //   350: goto +14 -> 364
    //   353: new 115	java/lang/String
    //   356: dup
    //   357: ldc_w 259
    //   360: invokespecial 194	java/lang/String:<init>	(Ljava/lang/String;)V
    //   363: astore_1
    //   364: ldc -83
    //   366: aload_1
    //   367: invokestatic 201	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   370: pop
    //   371: iconst_0
    //   372: ireturn
    //   373: aload_0
    //   374: aload_1
    //   375: iload_2
    //   376: invokestatic 261	com/google/android/gms/dynamite/DynamiteModule:b	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   379: istore 6
    //   381: iload 6
    //   383: ireturn
    //   384: astore_1
    //   385: ldc 2
    //   387: monitorexit
    //   388: aload_1
    //   389: athrow
    //   390: astore_1
    //   391: aload_0
    //   392: aload_1
    //   393: invokestatic 266	com/google/android/gms/common/util/g:a	(Landroid/content/Context;Ljava/lang/Throwable;)Z
    //   396: pop
    //   397: aload_1
    //   398: athrow
    //   399: astore 4
    //   401: goto -324 -> 77
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	404	0	paramContext	Context
    //   0	404	1	paramString	String
    //   0	404	2	paramBoolean	boolean
    //   6	269	3	localObject1	Object
    //   8	201	4	localObject2	Object
    //   215	5	4	localObject3	Object
    //   222	1	4	localNoSuchFieldException	NoSuchFieldException
    //   227	1	4	localIllegalAccessException	IllegalAccessException
    //   232	3	4	localClassNotFoundException	ClassNotFoundException
    //   252	52	4	localObject4	Object
    //   399	1	4	locala1	a
    //   49	119	5	localObject5	Object
    //   194	1	5	locala2	a
    //   123	259	6	i1	int
    //   308	3	7	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   117	140	194	com/google/android/gms/dynamite/DynamiteModule$a
    //   143	178	194	com/google/android/gms/dynamite/DynamiteModule$a
    //   40	51	215	finally
    //   56	69	215	finally
    //   72	77	215	finally
    //   77	82	215	finally
    //   85	114	215	finally
    //   117	140	215	finally
    //   143	178	215	finally
    //   178	180	215	finally
    //   186	188	215	finally
    //   196	210	215	finally
    //   210	212	215	finally
    //   217	219	215	finally
    //   14	40	222	java/lang/NoSuchFieldException
    //   219	222	222	java/lang/NoSuchFieldException
    //   14	40	227	java/lang/IllegalAccessException
    //   219	222	227	java/lang/IllegalAccessException
    //   14	40	232	java/lang/ClassNotFoundException
    //   219	222	232	java/lang/ClassNotFoundException
    //   315	323	326	com/google/android/gms/dynamite/DynamiteModule$a
    //   3	7	384	finally
    //   14	40	384	finally
    //   180	183	384	finally
    //   188	191	384	finally
    //   219	222	384	finally
    //   234	295	384	finally
    //   295	300	384	finally
    //   300	303	384	finally
    //   385	388	384	finally
    //   0	3	390	java/lang/Throwable
    //   303	310	390	java/lang/Throwable
    //   315	323	390	java/lang/Throwable
    //   327	350	390	java/lang/Throwable
    //   353	364	390	java/lang/Throwable
    //   364	371	390	java/lang/Throwable
    //   373	381	390	java/lang/Throwable
    //   388	390	390	java/lang/Throwable
    //   72	77	399	com/google/android/gms/dynamite/DynamiteModule$a
  }
  
  public static DynamiteModule a(Context paramContext, b paramb, String paramString)
    throws DynamiteModule.a
  {
    c localc1 = (c)f.get();
    c localc2 = new c(null);
    f.set(localc2);
    try
    {
      DynamiteModule.b.b localb = paramb.a(paramContext, paramString, g);
      int i1 = localb.a;
      int i2 = localb.b;
      int i3 = String.valueOf(paramString).length();
      int i4 = String.valueOf(paramString).length();
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>(i3 + 68 + i4);
      ((StringBuilder)localObject).append("Considering local module ");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(":");
      ((StringBuilder)localObject).append(i1);
      ((StringBuilder)localObject).append(" and remote module ");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(":");
      ((StringBuilder)localObject).append(i2);
      Log.i("DynamiteModule", ((StringBuilder)localObject).toString());
      if ((localb.c != 0) && ((localb.c != -1) || (localb.a != 0)) && ((localb.c != 1) || (localb.b != 0)))
      {
        if (localb.c == -1)
        {
          paramContext = c(paramContext, paramString);
          return paramContext;
        }
        i1 = localb.c;
        if (i1 == 1) {
          try
          {
            localObject = a(paramContext, paramString, localb.b);
            return (DynamiteModule)localObject;
          }
          catch (a locala)
          {
            localObject = String.valueOf(locala.getMessage());
            if (((String)localObject).length() != 0) {
              localObject = "Failed to load remote module: ".concat((String)localObject);
            } else {
              localObject = new String("Failed to load remote module: ");
            }
            Log.w("DynamiteModule", (String)localObject);
            if (localb.a != 0)
            {
              localObject = new com/google/android/gms/dynamite/DynamiteModule$d;
              ((d)localObject).<init>(localb.a, 0);
              if (paramb.a(paramContext, paramString, (DynamiteModule.b.a)localObject).c == -1)
              {
                paramContext = c(paramContext, paramString);
                return paramContext;
              }
            }
            paramContext = new com/google/android/gms/dynamite/DynamiteModule$a;
            paramContext.<init>("Remote load failed. No local fallback found.", locala, null);
            throw paramContext;
          }
        }
        paramContext = new com/google/android/gms/dynamite/DynamiteModule$a;
        i1 = localb.c;
        paramb = new java/lang/StringBuilder;
        paramb.<init>(47);
        paramb.append("VersionPolicy returned invalid code:");
        paramb.append(i1);
        paramContext.<init>(paramb.toString(), null);
        throw paramContext;
      }
      paramContext = new com/google/android/gms/dynamite/DynamiteModule$a;
      i1 = localb.a;
      i3 = localb.b;
      paramb = new java/lang/StringBuilder;
      paramb.<init>(91);
      paramb.append("No acceptable module found. Local version is ");
      paramb.append(i1);
      paramb.append(" and remote version is ");
      paramb.append(i3);
      paramb.append(".");
      paramContext.<init>(paramb.toString(), null);
      throw paramContext;
    }
    finally
    {
      paramb = localc2.a;
      if (paramb != null) {
        paramb.close();
      }
      f.set(localc1);
    }
  }
  
  /* Error */
  private static DynamiteModule a(Context paramContext, String paramString, int paramInt)
    throws DynamiteModule.a
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 210	com/google/android/gms/dynamite/DynamiteModule:a	Ljava/lang/Boolean;
    //   6: astore_3
    //   7: ldc 2
    //   9: monitorexit
    //   10: aload_3
    //   11: ifnull +184 -> 195
    //   14: aload_3
    //   15: invokevirtual 257	java/lang/Boolean:booleanValue	()Z
    //   18: ifeq +10 -> 28
    //   21: aload_0
    //   22: aload_1
    //   23: iload_2
    //   24: invokestatic 336	com/google/android/gms/dynamite/DynamiteModule:b	(Landroid/content/Context;Ljava/lang/String;I)Lcom/google/android/gms/dynamite/DynamiteModule;
    //   27: areturn
    //   28: aload_1
    //   29: invokestatic 119	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   32: invokevirtual 123	java/lang/String:length	()I
    //   35: istore 4
    //   37: new 125	java/lang/StringBuilder
    //   40: astore_3
    //   41: aload_3
    //   42: iload 4
    //   44: bipush 51
    //   46: iadd
    //   47: invokespecial 128	java/lang/StringBuilder:<init>	(I)V
    //   50: aload_3
    //   51: ldc_w 338
    //   54: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: pop
    //   58: aload_3
    //   59: aload_1
    //   60: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: aload_3
    //   65: ldc_w 340
    //   68: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload_3
    //   73: iload_2
    //   74: invokevirtual 290	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: ldc -83
    //   80: aload_3
    //   81: invokevirtual 140	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   84: invokestatic 294	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   87: pop
    //   88: aload_0
    //   89: invokestatic 343	com/google/android/gms/dynamite/DynamiteModule:a	(Landroid/content/Context;)Lcom/google/android/gms/dynamite/i;
    //   92: astore_3
    //   93: aload_3
    //   94: ifnull +87 -> 181
    //   97: aload_3
    //   98: invokeinterface 348 1 0
    //   103: iconst_2
    //   104: if_icmplt +19 -> 123
    //   107: aload_3
    //   108: aload_0
    //   109: invokestatic 353	Iq:a	(Ljava/lang/Object;)LHq;
    //   112: aload_1
    //   113: iload_2
    //   114: invokeinterface 356 4 0
    //   119: astore_1
    //   120: goto +25 -> 145
    //   123: ldc -83
    //   125: ldc_w 358
    //   128: invokestatic 201	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   131: pop
    //   132: aload_3
    //   133: aload_0
    //   134: invokestatic 353	Iq:a	(Ljava/lang/Object;)LHq;
    //   137: aload_1
    //   138: iload_2
    //   139: invokeinterface 360 4 0
    //   144: astore_1
    //   145: aload_1
    //   146: invokestatic 364	Iq:J	(LHq;)Ljava/lang/Object;
    //   149: ifnull +18 -> 167
    //   152: new 2	com/google/android/gms/dynamite/DynamiteModule
    //   155: dup
    //   156: aload_1
    //   157: invokestatic 364	Iq:J	(LHq;)Ljava/lang/Object;
    //   160: checkcast 98	android/content/Context
    //   163: invokespecial 366	com/google/android/gms/dynamite/DynamiteModule:<init>	(Landroid/content/Context;)V
    //   166: areturn
    //   167: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   170: astore_1
    //   171: aload_1
    //   172: ldc_w 368
    //   175: aconst_null
    //   176: invokespecial 325	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/a;)V
    //   179: aload_1
    //   180: athrow
    //   181: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   184: astore_1
    //   185: aload_1
    //   186: ldc_w 370
    //   189: aconst_null
    //   190: invokespecial 325	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/a;)V
    //   193: aload_1
    //   194: athrow
    //   195: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   198: astore_1
    //   199: aload_1
    //   200: ldc_w 372
    //   203: aconst_null
    //   204: invokespecial 325	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/a;)V
    //   207: aload_1
    //   208: athrow
    //   209: astore_1
    //   210: ldc 2
    //   212: monitorexit
    //   213: aload_1
    //   214: athrow
    //   215: astore_1
    //   216: aload_0
    //   217: aload_1
    //   218: invokestatic 266	com/google/android/gms/common/util/g:a	(Landroid/content/Context;Ljava/lang/Throwable;)Z
    //   221: pop
    //   222: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   225: dup
    //   226: ldc_w 368
    //   229: aload_1
    //   230: aconst_null
    //   231: invokespecial 320	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/android/gms/dynamite/a;)V
    //   234: athrow
    //   235: astore_0
    //   236: aload_0
    //   237: athrow
    //   238: astore_0
    //   239: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   242: dup
    //   243: ldc_w 368
    //   246: aload_0
    //   247: aconst_null
    //   248: invokespecial 320	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/android/gms/dynamite/a;)V
    //   251: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	252	0	paramContext	Context
    //   0	252	1	paramString	String
    //   0	252	2	paramInt	int
    //   6	127	3	localObject	Object
    //   35	12	4	i1	int
    // Exception table:
    //   from	to	target	type
    //   3	10	209	finally
    //   210	213	209	finally
    //   0	3	215	java/lang/Throwable
    //   14	28	215	java/lang/Throwable
    //   28	93	215	java/lang/Throwable
    //   97	120	215	java/lang/Throwable
    //   123	145	215	java/lang/Throwable
    //   145	167	215	java/lang/Throwable
    //   167	181	215	java/lang/Throwable
    //   181	195	215	java/lang/Throwable
    //   195	209	215	java/lang/Throwable
    //   213	215	215	java/lang/Throwable
    //   0	3	235	com/google/android/gms/dynamite/DynamiteModule$a
    //   14	28	235	com/google/android/gms/dynamite/DynamiteModule$a
    //   28	93	235	com/google/android/gms/dynamite/DynamiteModule$a
    //   97	120	235	com/google/android/gms/dynamite/DynamiteModule$a
    //   123	145	235	com/google/android/gms/dynamite/DynamiteModule$a
    //   145	167	235	com/google/android/gms/dynamite/DynamiteModule$a
    //   167	181	235	com/google/android/gms/dynamite/DynamiteModule$a
    //   181	195	235	com/google/android/gms/dynamite/DynamiteModule$a
    //   195	209	235	com/google/android/gms/dynamite/DynamiteModule$a
    //   213	215	235	com/google/android/gms/dynamite/DynamiteModule$a
    //   0	3	238	android/os/RemoteException
    //   14	28	238	android/os/RemoteException
    //   28	93	238	android/os/RemoteException
    //   97	120	238	android/os/RemoteException
    //   123	145	238	android/os/RemoteException
    //   145	167	238	android/os/RemoteException
    //   167	181	238	android/os/RemoteException
    //   181	195	238	android/os/RemoteException
    //   195	209	238	android/os/RemoteException
    //   213	215	238	android/os/RemoteException
  }
  
  /* Error */
  private static i a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 374	com/google/android/gms/dynamite/DynamiteModule:b	Lcom/google/android/gms/dynamite/i;
    //   6: ifnull +12 -> 18
    //   9: getstatic 374	com/google/android/gms/dynamite/DynamiteModule:b	Lcom/google/android/gms/dynamite/i;
    //   12: astore_0
    //   13: ldc 2
    //   15: monitorexit
    //   16: aload_0
    //   17: areturn
    //   18: invokestatic 379	com/google/android/gms/common/f:a	()Lcom/google/android/gms/common/f;
    //   21: aload_0
    //   22: invokevirtual 382	com/google/android/gms/common/f:c	(Landroid/content/Context;)I
    //   25: ifeq +8 -> 33
    //   28: ldc 2
    //   30: monitorexit
    //   31: aconst_null
    //   32: areturn
    //   33: aload_0
    //   34: ldc -25
    //   36: iconst_3
    //   37: invokevirtual 386	android/content/Context:createPackageContext	(Ljava/lang/String;I)Landroid/content/Context;
    //   40: invokevirtual 113	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   43: ldc_w 388
    //   46: invokevirtual 146	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   49: invokevirtual 391	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   52: checkcast 393	android/os/IBinder
    //   55: astore_1
    //   56: aload_1
    //   57: ifnonnull +8 -> 65
    //   60: aconst_null
    //   61: astore_0
    //   62: goto +37 -> 99
    //   65: aload_1
    //   66: ldc_w 395
    //   69: invokeinterface 399 2 0
    //   74: astore_0
    //   75: aload_0
    //   76: instanceof 345
    //   79: ifeq +11 -> 90
    //   82: aload_0
    //   83: checkcast 345	com/google/android/gms/dynamite/i
    //   86: astore_0
    //   87: goto +12 -> 99
    //   90: new 401	com/google/android/gms/dynamite/j
    //   93: dup
    //   94: aload_1
    //   95: invokespecial 404	com/google/android/gms/dynamite/j:<init>	(Landroid/os/IBinder;)V
    //   98: astore_0
    //   99: aload_0
    //   100: ifnull +57 -> 157
    //   103: aload_0
    //   104: putstatic 374	com/google/android/gms/dynamite/DynamiteModule:b	Lcom/google/android/gms/dynamite/i;
    //   107: ldc 2
    //   109: monitorexit
    //   110: aload_0
    //   111: areturn
    //   112: astore_0
    //   113: aload_0
    //   114: invokevirtual 185	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   117: invokestatic 119	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   120: astore_0
    //   121: aload_0
    //   122: invokevirtual 123	java/lang/String:length	()I
    //   125: ifeq +14 -> 139
    //   128: ldc_w 406
    //   131: aload_0
    //   132: invokevirtual 191	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   135: astore_0
    //   136: goto +14 -> 150
    //   139: new 115	java/lang/String
    //   142: dup
    //   143: ldc_w 406
    //   146: invokespecial 194	java/lang/String:<init>	(Ljava/lang/String;)V
    //   149: astore_0
    //   150: ldc -83
    //   152: aload_0
    //   153: invokestatic 178	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   156: pop
    //   157: ldc 2
    //   159: monitorexit
    //   160: aconst_null
    //   161: areturn
    //   162: astore_0
    //   163: ldc 2
    //   165: monitorexit
    //   166: aload_0
    //   167: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	168	0	paramContext	Context
    //   55	40	1	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   33	56	112	java/lang/Exception
    //   65	87	112	java/lang/Exception
    //   90	99	112	java/lang/Exception
    //   103	107	112	java/lang/Exception
    //   3	16	162	finally
    //   18	31	162	finally
    //   33	56	162	finally
    //   65	87	162	finally
    //   90	99	162	finally
    //   103	107	162	finally
    //   107	110	162	finally
    //   113	136	162	finally
    //   139	150	162	finally
    //   150	157	162	finally
    //   157	160	162	finally
    //   163	166	162	finally
  }
  
  private static void a(ClassLoader paramClassLoader)
    throws DynamiteModule.a
  {
    try
    {
      IBinder localIBinder = (IBinder)paramClassLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
      if (localIBinder == null)
      {
        paramClassLoader = null;
      }
      else
      {
        paramClassLoader = localIBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
        if ((paramClassLoader instanceof k)) {
          paramClassLoader = (k)paramClassLoader;
        } else {
          paramClassLoader = new l(localIBinder);
        }
      }
      c = paramClassLoader;
      return;
    }
    catch (NoSuchMethodException paramClassLoader) {}catch (InvocationTargetException paramClassLoader) {}catch (InstantiationException paramClassLoader) {}catch (IllegalAccessException paramClassLoader) {}catch (ClassNotFoundException paramClassLoader) {}
    throw new a("Failed to instantiate dynamite loader", paramClassLoader, null);
  }
  
  public static int b(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, false);
  }
  
  private static int b(Context paramContext, String paramString, boolean paramBoolean)
  {
    i locali = a(paramContext);
    if (locali == null) {
      return 0;
    }
    try
    {
      if (locali.ub() >= 2) {
        return locali.a(Iq.a(paramContext), paramString, paramBoolean);
      }
      Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
      int i1 = locali.b(Iq.a(paramContext), paramString, paramBoolean);
      return i1;
    }
    catch (RemoteException paramContext)
    {
      paramContext = String.valueOf(paramContext.getMessage());
      if (paramContext.length() != 0) {
        paramContext = "Failed to retrieve remote module version: ".concat(paramContext);
      } else {
        paramContext = new String("Failed to retrieve remote module version: ");
      }
      Log.w("DynamiteModule", paramContext);
    }
    return 0;
  }
  
  private static DynamiteModule b(Context paramContext, String paramString, int paramInt)
    throws DynamiteModule.a, RemoteException
  {
    Object localObject1 = new StringBuilder(String.valueOf(paramString).length() + 51);
    ((StringBuilder)localObject1).append("Selected remote version of ");
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append(", version >= ");
    ((StringBuilder)localObject1).append(paramInt);
    Log.i("DynamiteModule", ((StringBuilder)localObject1).toString());
    try
    {
      localObject1 = c;
      if (localObject1 != null)
      {
        Object localObject2 = (c)f.get();
        if ((localObject2 != null) && (((c)localObject2).a != null))
        {
          paramContext = paramContext.getApplicationContext();
          localObject2 = ((c)localObject2).a;
          Iq.a(null);
          if (b().booleanValue())
          {
            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
            paramContext = ((k)localObject1).b(Iq.a(paramContext), paramString, paramInt, Iq.a(localObject2));
          }
          else
          {
            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
            paramContext = ((k)localObject1).a(Iq.a(paramContext), paramString, paramInt, Iq.a(localObject2));
          }
          paramContext = (Context)Iq.J(paramContext);
          if (paramContext != null) {
            return new DynamiteModule(paramContext);
          }
          throw new a("Failed to get module context", null);
        }
        throw new a("No result cursor", null);
      }
      throw new a("DynamiteLoaderV2 was not cached.", null);
    }
    finally {}
  }
  
  private static Boolean b()
  {
    try
    {
      boolean bool;
      if (e >= 2) {
        bool = true;
      } else {
        bool = false;
      }
      return Boolean.valueOf(bool);
    }
    finally {}
  }
  
  /* Error */
  private static int c(Context paramContext, String paramString, boolean paramBoolean)
    throws DynamiteModule.a
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: invokevirtual 474	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   6: astore 4
    //   8: iload_2
    //   9: ifeq +10 -> 19
    //   12: ldc_w 476
    //   15: astore_0
    //   16: goto +7 -> 23
    //   19: ldc_w 478
    //   22: astore_0
    //   23: aload_0
    //   24: invokevirtual 123	java/lang/String:length	()I
    //   27: istore 5
    //   29: aload_1
    //   30: invokestatic 119	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   33: invokevirtual 123	java/lang/String:length	()I
    //   36: istore 6
    //   38: new 125	java/lang/StringBuilder
    //   41: astore 7
    //   43: aload 7
    //   45: iload 5
    //   47: bipush 42
    //   49: iadd
    //   50: iload 6
    //   52: iadd
    //   53: invokespecial 128	java/lang/StringBuilder:<init>	(I)V
    //   56: aload 7
    //   58: ldc_w 480
    //   61: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: pop
    //   65: aload 7
    //   67: aload_0
    //   68: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload 7
    //   74: ldc_w 482
    //   77: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: pop
    //   81: aload 7
    //   83: aload_1
    //   84: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: aload 4
    //   90: aload 7
    //   92: invokevirtual 140	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   95: invokestatic 488	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   98: aconst_null
    //   99: aconst_null
    //   100: aconst_null
    //   101: aconst_null
    //   102: invokevirtual 494	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   105: astore_0
    //   106: aload_0
    //   107: ifnull +125 -> 232
    //   110: aload_0
    //   111: invokeinterface 497 1 0
    //   116: ifeq +116 -> 232
    //   119: aload_0
    //   120: iconst_0
    //   121: invokeinterface 500 2 0
    //   126: istore 6
    //   128: aload_0
    //   129: astore_1
    //   130: iload 6
    //   132: ifle +87 -> 219
    //   135: ldc 2
    //   137: monitorenter
    //   138: aload_0
    //   139: iconst_2
    //   140: invokeinterface 504 2 0
    //   145: putstatic 243	com/google/android/gms/dynamite/DynamiteModule:d	Ljava/lang/String;
    //   148: aload_0
    //   149: ldc_w 506
    //   152: invokeinterface 510 2 0
    //   157: istore 5
    //   159: iload 5
    //   161: iflt +14 -> 175
    //   164: aload_0
    //   165: iload 5
    //   167: invokeinterface 500 2 0
    //   172: putstatic 467	com/google/android/gms/dynamite/DynamiteModule:e	I
    //   175: ldc 2
    //   177: monitorexit
    //   178: getstatic 53	com/google/android/gms/dynamite/DynamiteModule:f	Ljava/lang/ThreadLocal;
    //   181: invokevirtual 270	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   184: checkcast 19	com/google/android/gms/dynamite/DynamiteModule$c
    //   187: astore_3
    //   188: aload_0
    //   189: astore_1
    //   190: aload_3
    //   191: ifnull +28 -> 219
    //   194: aload_0
    //   195: astore_1
    //   196: aload_3
    //   197: getfield 302	com/google/android/gms/dynamite/DynamiteModule$c:a	Landroid/database/Cursor;
    //   200: ifnonnull +19 -> 219
    //   203: aload_3
    //   204: aload_0
    //   205: putfield 302	com/google/android/gms/dynamite/DynamiteModule$c:a	Landroid/database/Cursor;
    //   208: aconst_null
    //   209: astore_1
    //   210: goto +9 -> 219
    //   213: astore_1
    //   214: ldc 2
    //   216: monitorexit
    //   217: aload_1
    //   218: athrow
    //   219: aload_1
    //   220: ifnull +9 -> 229
    //   223: aload_1
    //   224: invokeinterface 307 1 0
    //   229: iload 6
    //   231: ireturn
    //   232: ldc -83
    //   234: ldc_w 512
    //   237: invokestatic 201	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   240: pop
    //   241: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   244: astore_1
    //   245: aload_1
    //   246: ldc_w 514
    //   249: aconst_null
    //   250: invokespecial 325	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/a;)V
    //   253: aload_1
    //   254: athrow
    //   255: astore_1
    //   256: goto +41 -> 297
    //   259: astore_1
    //   260: goto +12 -> 272
    //   263: astore_1
    //   264: aload_3
    //   265: astore_0
    //   266: goto +31 -> 297
    //   269: astore_1
    //   270: aconst_null
    //   271: astore_0
    //   272: aload_1
    //   273: instanceof 9
    //   276: ifeq +5 -> 281
    //   279: aload_1
    //   280: athrow
    //   281: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   284: astore_3
    //   285: aload_3
    //   286: ldc_w 516
    //   289: aload_1
    //   290: aconst_null
    //   291: invokespecial 320	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/android/gms/dynamite/a;)V
    //   294: aload_3
    //   295: athrow
    //   296: astore_1
    //   297: aload_0
    //   298: ifnull +9 -> 307
    //   301: aload_0
    //   302: invokeinterface 307 1 0
    //   307: aload_1
    //   308: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	309	0	paramContext	Context
    //   0	309	1	paramString	String
    //   0	309	2	paramBoolean	boolean
    //   1	294	3	localObject	Object
    //   6	83	4	localContentResolver	android.content.ContentResolver
    //   27	139	5	i1	int
    //   36	194	6	i2	int
    //   41	50	7	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   138	159	213	finally
    //   164	175	213	finally
    //   175	178	213	finally
    //   214	217	213	finally
    //   110	128	255	finally
    //   135	138	255	finally
    //   178	188	255	finally
    //   196	208	255	finally
    //   217	219	255	finally
    //   232	255	255	finally
    //   110	128	259	java/lang/Exception
    //   135	138	259	java/lang/Exception
    //   178	188	259	java/lang/Exception
    //   196	208	259	java/lang/Exception
    //   217	219	259	java/lang/Exception
    //   232	255	259	java/lang/Exception
    //   2	8	263	finally
    //   23	106	263	finally
    //   2	8	269	java/lang/Exception
    //   23	106	269	java/lang/Exception
    //   272	281	296	finally
    //   281	296	296	finally
  }
  
  private static DynamiteModule c(Context paramContext, String paramString)
  {
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "Selected local version of ".concat(paramString);
    } else {
      paramString = new String("Selected local version of ");
    }
    Log.i("DynamiteModule", paramString);
    return new DynamiteModule(paramContext.getApplicationContext());
  }
  
  public final Context a()
  {
    return this.n;
  }
  
  public final IBinder a(String paramString)
    throws DynamiteModule.a
  {
    try
    {
      IBinder localIBinder = (IBinder)this.n.getClassLoader().loadClass(paramString).newInstance();
      return localIBinder;
    }
    catch (IllegalAccessException localIllegalAccessException) {}catch (InstantiationException localInstantiationException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "Failed to instantiate module class: ".concat(paramString);
    } else {
      paramString = new String("Failed to instantiate module class: ");
    }
    throw new a(paramString, localClassNotFoundException, null);
  }
  
  @DynamiteApi
  public static class DynamiteLoaderClassLoader
  {
    public static ClassLoader sClassLoader;
  }
  
  public static class a
    extends Exception
  {
    private a(String paramString)
    {
      super();
    }
    
    private a(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
  
  public static abstract interface b
  {
    public abstract b a(Context paramContext, String paramString, a parama)
      throws DynamiteModule.a;
    
    public static abstract interface a
    {
      public abstract int a(Context paramContext, String paramString);
      
      public abstract int a(Context paramContext, String paramString, boolean paramBoolean)
        throws DynamiteModule.a;
    }
    
    public static final class b
    {
      public int a = 0;
      public int b = 0;
      public int c = 0;
    }
  }
  
  private static final class c
  {
    public Cursor a;
  }
  
  private static final class d
    implements DynamiteModule.b.a
  {
    private final int a;
    private final int b;
    
    public d(int paramInt1, int paramInt2)
    {
      this.a = paramInt1;
      this.b = 0;
    }
    
    public final int a(Context paramContext, String paramString)
    {
      return this.a;
    }
    
    public final int a(Context paramContext, String paramString, boolean paramBoolean)
    {
      return 0;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/dynamite/DynamiteModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */