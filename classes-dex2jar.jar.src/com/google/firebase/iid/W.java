package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nP;
import oP;
import qP;
import ud;

final class w
{
  private static int a;
  private static PendingIntent b;
  private final ud<String, oP<Bundle>> c = new ud();
  private final Context d;
  private final q e;
  private Messenger f;
  private Messenger g;
  private O h;
  
  public w(Context paramContext, q paramq)
  {
    this.d = paramContext;
    this.e = paramq;
    this.f = new Messenger(new x(this, Looper.getMainLooper()));
  }
  
  private static String a()
  {
    try
    {
      int i = a;
      a = i + 1;
      String str = Integer.toString(i);
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static void a(Context paramContext, Intent paramIntent)
  {
    try
    {
      if (b == null)
      {
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        localIntent.setPackage("com.google.example.invalidpackage");
        b = PendingIntent.getBroadcast(paramContext, 0, localIntent, 0);
      }
      paramIntent.putExtra("app", b);
      return;
    }
    finally {}
  }
  
  private final void a(Message paramMessage)
  {
    if (paramMessage != null)
    {
      Object localObject1 = paramMessage.obj;
      if ((localObject1 instanceof Intent))
      {
        localObject1 = (Intent)localObject1;
        ((Intent)localObject1).setExtrasClassLoader(new O.a());
        if (((Intent)localObject1).hasExtra("google.messenger"))
        {
          localObject1 = ((Intent)localObject1).getParcelableExtra("google.messenger");
          if ((localObject1 instanceof O)) {
            this.h = ((O)localObject1);
          }
          if ((localObject1 instanceof Messenger)) {
            this.g = ((Messenger)localObject1);
          }
        }
        Object localObject4 = (Intent)paramMessage.obj;
        paramMessage = ((Intent)localObject4).getAction();
        if (!"com.google.android.c2dm.intent.REGISTRATION".equals(paramMessage))
        {
          if (Log.isLoggable("FirebaseInstanceId", 3))
          {
            paramMessage = String.valueOf(paramMessage);
            if (paramMessage.length() != 0) {
              paramMessage = "Unexpected response action: ".concat(paramMessage);
            } else {
              paramMessage = new String("Unexpected response action: ");
            }
            Log.d("FirebaseInstanceId", paramMessage);
          }
          return;
        }
        localObject1 = ((Intent)localObject4).getStringExtra("registration_id");
        paramMessage = (Message)localObject1;
        if (localObject1 == null) {
          paramMessage = ((Intent)localObject4).getStringExtra("unregistered");
        }
        if (paramMessage == null)
        {
          localObject1 = ((Intent)localObject4).getStringExtra("error");
          if (localObject1 == null)
          {
            localObject1 = String.valueOf(((Intent)localObject4).getExtras());
            paramMessage = new StringBuilder(String.valueOf(localObject1).length() + 49);
            paramMessage.append("Unexpected response, no error or registration id ");
            paramMessage.append((String)localObject1);
            Log.w("FirebaseInstanceId", paramMessage.toString());
            return;
          }
          if (Log.isLoggable("FirebaseInstanceId", 3))
          {
            paramMessage = String.valueOf(localObject1);
            if (paramMessage.length() != 0) {
              paramMessage = "Received InstanceID error ".concat(paramMessage);
            } else {
              paramMessage = new String("Received InstanceID error ");
            }
            Log.d("FirebaseInstanceId", paramMessage);
          }
          if (((String)localObject1).startsWith("|"))
          {
            paramMessage = ((String)localObject1).split("\\|");
            if ((paramMessage.length > 2) && ("ID".equals(paramMessage[1])))
            {
              String str = paramMessage[2];
              localObject1 = paramMessage[3];
              paramMessage = (Message)localObject1;
              if (((String)localObject1).startsWith(":")) {
                paramMessage = ((String)localObject1).substring(1);
              }
              a(str, ((Intent)localObject4).putExtra("error", paramMessage).getExtras());
              return;
            }
            paramMessage = String.valueOf(localObject1);
            if (paramMessage.length() != 0) {
              paramMessage = "Unexpected structured response ".concat(paramMessage);
            } else {
              paramMessage = new String("Unexpected structured response ");
            }
            Log.w("FirebaseInstanceId", paramMessage);
            return;
          }
          paramMessage = this.c;
          int i = 0;
          try
          {
            while (i < this.c.size())
            {
              a((String)this.c.b(i), ((Intent)localObject4).getExtras());
              i++;
            }
          }
          finally {}
        }
        Object localObject3 = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(paramMessage);
        if (!((Matcher)localObject3).matches())
        {
          if (Log.isLoggable("FirebaseInstanceId", 3))
          {
            paramMessage = String.valueOf(paramMessage);
            if (paramMessage.length() != 0) {
              paramMessage = "Unexpected response string: ".concat(paramMessage);
            } else {
              paramMessage = new String("Unexpected response string: ");
            }
            Log.d("FirebaseInstanceId", paramMessage);
          }
          return;
        }
        paramMessage = ((Matcher)localObject3).group(1);
        localObject3 = ((Matcher)localObject3).group(2);
        localObject4 = ((Intent)localObject4).getExtras();
        ((Bundle)localObject4).putString("registration_id", (String)localObject3);
        a(paramMessage, (Bundle)localObject4);
        return;
      }
    }
    Log.w("FirebaseInstanceId", "Dropping invalid message");
  }
  
  private final void a(String paramString, Bundle paramBundle)
  {
    synchronized (this.c)
    {
      oP localoP = (oP)this.c.remove(paramString);
      if (localoP == null)
      {
        paramString = String.valueOf(paramString);
        if (paramString.length() != 0) {
          paramString = "Missing callback for ".concat(paramString);
        } else {
          paramString = new String("Missing callback for ");
        }
        Log.w("FirebaseInstanceId", paramString);
        return;
      }
      localoP.a(paramBundle);
      return;
    }
  }
  
  private final Bundle b(Bundle paramBundle)
    throws IOException
  {
    Bundle localBundle1 = c(paramBundle);
    Bundle localBundle2 = localBundle1;
    if (localBundle1 != null)
    {
      localBundle2 = localBundle1;
      if (localBundle1.containsKey("google.messenger"))
      {
        paramBundle = c(paramBundle);
        localBundle2 = paramBundle;
        if (paramBundle != null)
        {
          localBundle2 = paramBundle;
          if (paramBundle.containsKey("google.messenger")) {
            localBundle2 = null;
          }
        }
      }
    }
    return localBundle2;
  }
  
  /* Error */
  private final Bundle c(Bundle arg1)
    throws IOException
  {
    // Byte code:
    //   0: invokestatic 282	com/google/firebase/iid/w:a	()Ljava/lang/String;
    //   3: astore_2
    //   4: new 258	oP
    //   7: dup
    //   8: invokespecial 283	oP:<init>	()V
    //   11: astore_3
    //   12: aload_0
    //   13: getfield 30	com/google/firebase/iid/w:c	Lud;
    //   16: astore 4
    //   18: aload 4
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield 30	com/google/firebase/iid/w:c	Lud;
    //   25: aload_2
    //   26: aload_3
    //   27: invokevirtual 287	ud:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   30: pop
    //   31: aload 4
    //   33: monitorexit
    //   34: aload_0
    //   35: getfield 34	com/google/firebase/iid/w:e	Lcom/google/firebase/iid/q;
    //   38: invokevirtual 291	com/google/firebase/iid/q:a	()I
    //   41: ifeq +406 -> 447
    //   44: new 67	android/content/Intent
    //   47: dup
    //   48: invokespecial 68	android/content/Intent:<init>	()V
    //   51: astore 4
    //   53: aload 4
    //   55: ldc_w 293
    //   58: invokevirtual 74	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   61: pop
    //   62: aload_0
    //   63: getfield 34	com/google/firebase/iid/w:e	Lcom/google/firebase/iid/q;
    //   66: invokevirtual 291	com/google/firebase/iid/q:a	()I
    //   69: iconst_2
    //   70: if_icmpne +15 -> 85
    //   73: aload 4
    //   75: ldc_w 295
    //   78: invokevirtual 298	android/content/Intent:setAction	(Ljava/lang/String;)Landroid/content/Intent;
    //   81: pop
    //   82: goto +12 -> 94
    //   85: aload 4
    //   87: ldc_w 300
    //   90: invokevirtual 298	android/content/Intent:setAction	(Ljava/lang/String;)Landroid/content/Intent;
    //   93: pop
    //   94: aload 4
    //   96: aload_1
    //   97: invokevirtual 304	android/content/Intent:putExtras	(Landroid/os/Bundle;)Landroid/content/Intent;
    //   100: pop
    //   101: aload_0
    //   102: getfield 32	com/google/firebase/iid/w:d	Landroid/content/Context;
    //   105: aload 4
    //   107: invokestatic 306	com/google/firebase/iid/w:a	(Landroid/content/Context;Landroid/content/Intent;)V
    //   110: new 170	java/lang/StringBuilder
    //   113: dup
    //   114: aload_2
    //   115: invokestatic 139	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   118: invokevirtual 143	java/lang/String:length	()I
    //   121: iconst_5
    //   122: iadd
    //   123: invokespecial 173	java/lang/StringBuilder:<init>	(I)V
    //   126: astore_1
    //   127: aload_1
    //   128: ldc_w 308
    //   131: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: pop
    //   135: aload_1
    //   136: aload_2
    //   137: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: aload_1
    //   142: ldc -68
    //   144: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: pop
    //   148: aload 4
    //   150: ldc_w 310
    //   153: aload_1
    //   154: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   157: invokevirtual 207	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   160: pop
    //   161: ldc -127
    //   163: iconst_3
    //   164: invokestatic 135	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   167: ifeq +57 -> 224
    //   170: aload 4
    //   172: invokevirtual 168	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   175: invokestatic 139	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   178: astore 5
    //   180: new 170	java/lang/StringBuilder
    //   183: dup
    //   184: aload 5
    //   186: invokestatic 139	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   189: invokevirtual 143	java/lang/String:length	()I
    //   192: bipush 8
    //   194: iadd
    //   195: invokespecial 173	java/lang/StringBuilder:<init>	(I)V
    //   198: astore_1
    //   199: aload_1
    //   200: ldc_w 312
    //   203: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: pop
    //   207: aload_1
    //   208: aload 5
    //   210: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: pop
    //   214: ldc -127
    //   216: aload_1
    //   217: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   220: invokestatic 155	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   223: pop
    //   224: aload 4
    //   226: ldc 102
    //   228: aload_0
    //   229: getfield 52	com/google/firebase/iid/w:f	Landroid/os/Messenger;
    //   232: invokevirtual 86	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   235: pop
    //   236: aload_0
    //   237: getfield 116	com/google/firebase/iid/w:g	Landroid/os/Messenger;
    //   240: ifnonnull +10 -> 250
    //   243: aload_0
    //   244: getfield 114	com/google/firebase/iid/w:h	Lcom/google/firebase/iid/O;
    //   247: ifnull +61 -> 308
    //   250: invokestatic 316	android/os/Message:obtain	()Landroid/os/Message;
    //   253: astore_1
    //   254: aload_1
    //   255: aload 4
    //   257: putfield 93	android/os/Message:obj	Ljava/lang/Object;
    //   260: aload_0
    //   261: getfield 116	com/google/firebase/iid/w:g	Landroid/os/Messenger;
    //   264: ifnull +14 -> 278
    //   267: aload_0
    //   268: getfield 116	com/google/firebase/iid/w:g	Landroid/os/Messenger;
    //   271: aload_1
    //   272: invokevirtual 319	android/os/Messenger:send	(Landroid/os/Message;)V
    //   275: goto +66 -> 341
    //   278: aload_0
    //   279: getfield 114	com/google/firebase/iid/w:h	Lcom/google/firebase/iid/O;
    //   282: aload_1
    //   283: invokevirtual 320	com/google/firebase/iid/O:a	(Landroid/os/Message;)V
    //   286: goto +55 -> 341
    //   289: astore_1
    //   290: ldc -127
    //   292: iconst_3
    //   293: invokestatic 135	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   296: ifeq +12 -> 308
    //   299: ldc -127
    //   301: ldc_w 322
    //   304: invokestatic 155	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   307: pop
    //   308: aload_0
    //   309: getfield 34	com/google/firebase/iid/w:e	Lcom/google/firebase/iid/q;
    //   312: invokevirtual 291	com/google/firebase/iid/q:a	()I
    //   315: iconst_2
    //   316: if_icmpne +15 -> 331
    //   319: aload_0
    //   320: getfield 32	com/google/firebase/iid/w:d	Landroid/content/Context;
    //   323: aload 4
    //   325: invokevirtual 328	android/content/Context:sendBroadcast	(Landroid/content/Intent;)V
    //   328: goto +13 -> 341
    //   331: aload_0
    //   332: getfield 32	com/google/firebase/iid/w:d	Landroid/content/Context;
    //   335: aload 4
    //   337: invokevirtual 332	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   340: pop
    //   341: aload_3
    //   342: invokevirtual 335	oP:a	()LnP;
    //   345: ldc2_w 336
    //   348: getstatic 343	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   351: invokestatic 348	qP:a	(LnP;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //   354: checkcast 243	android/os/Bundle
    //   357: astore_3
    //   358: aload_0
    //   359: getfield 30	com/google/firebase/iid/w:c	Lud;
    //   362: astore_1
    //   363: aload_1
    //   364: monitorenter
    //   365: aload_0
    //   366: getfield 30	com/google/firebase/iid/w:c	Lud;
    //   369: aload_2
    //   370: invokevirtual 256	ud:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   373: pop
    //   374: aload_1
    //   375: monitorexit
    //   376: aload_3
    //   377: areturn
    //   378: astore_2
    //   379: aload_1
    //   380: monitorexit
    //   381: aload_2
    //   382: athrow
    //   383: astore_3
    //   384: goto +38 -> 422
    //   387: astore_3
    //   388: new 266	java/io/IOException
    //   391: astore_1
    //   392: aload_1
    //   393: aload_3
    //   394: invokespecial 351	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   397: aload_1
    //   398: athrow
    //   399: astore_1
    //   400: ldc -127
    //   402: ldc_w 353
    //   405: invokestatic 184	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   408: pop
    //   409: new 266	java/io/IOException
    //   412: astore_1
    //   413: aload_1
    //   414: ldc_w 355
    //   417: invokespecial 356	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   420: aload_1
    //   421: athrow
    //   422: aload_0
    //   423: getfield 30	com/google/firebase/iid/w:c	Lud;
    //   426: astore_1
    //   427: aload_1
    //   428: monitorenter
    //   429: aload_0
    //   430: getfield 30	com/google/firebase/iid/w:c	Lud;
    //   433: aload_2
    //   434: invokevirtual 256	ud:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   437: pop
    //   438: aload_1
    //   439: monitorexit
    //   440: aload_3
    //   441: athrow
    //   442: astore_2
    //   443: aload_1
    //   444: monitorexit
    //   445: aload_2
    //   446: athrow
    //   447: new 266	java/io/IOException
    //   450: dup
    //   451: ldc_w 358
    //   454: invokespecial 356	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   457: athrow
    //   458: astore_1
    //   459: aload 4
    //   461: monitorexit
    //   462: aload_1
    //   463: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	464	0	this	w
    //   3	367	2	str1	String
    //   378	56	2	localObject1	Object
    //   442	4	2	localObject2	Object
    //   11	366	3	localObject3	Object
    //   383	1	3	localObject4	Object
    //   387	54	3	localExecutionException	ExecutionException
    //   16	444	4	localObject5	Object
    //   178	31	5	str2	String
    // Exception table:
    //   from	to	target	type
    //   260	275	289	android/os/RemoteException
    //   278	286	289	android/os/RemoteException
    //   365	376	378	finally
    //   379	381	378	finally
    //   341	358	383	finally
    //   388	399	383	finally
    //   400	422	383	finally
    //   341	358	387	java/util/concurrent/ExecutionException
    //   341	358	399	java/lang/InterruptedException
    //   341	358	399	java/util/concurrent/TimeoutException
    //   429	440	442	finally
    //   443	445	442	finally
    //   21	34	458	finally
    //   459	462	458	finally
  }
  
  final Bundle a(Bundle paramBundle)
    throws IOException
  {
    if (this.e.d() >= 12000000)
    {
      Object localObject = e.a(this.d).b(1, paramBundle);
      try
      {
        localObject = (Bundle)qP.a((nP)localObject);
        return (Bundle)localObject;
      }
      catch (ExecutionException localExecutionException) {}catch (InterruptedException localInterruptedException) {}
      if (Log.isLoggable("FirebaseInstanceId", 3))
      {
        String str = String.valueOf(localInterruptedException);
        StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 22);
        localStringBuilder.append("Error making request: ");
        localStringBuilder.append(str);
        Log.d("FirebaseInstanceId", localStringBuilder.toString());
      }
      if (((localInterruptedException.getCause() instanceof o)) && (((o)localInterruptedException.getCause()).a() == 4)) {
        return b(paramBundle);
      }
      return null;
    }
    return b(paramBundle);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/iid/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */