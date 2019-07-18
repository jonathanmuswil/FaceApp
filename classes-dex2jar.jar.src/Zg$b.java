import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.bumptech.glide.load.a;
import java.io.File;
import java.io.FileNotFoundException;

class Zg$b
  implements Ze<File>
{
  private static final String[] a = { "_data" };
  private final Context b;
  private final Uri c;
  
  Zg$b(Context paramContext, Uri paramUri)
  {
    this.b = paramContext;
    this.c = paramUri;
  }
  
  public Class<File> a()
  {
    return File.class;
  }
  
  public void a(Fe paramFe, Ze.a<? super File> parama)
  {
    Cursor localCursor = this.b.getContentResolver().query(this.c, a, null, null, null);
    paramFe = null;
    Object localObject = null;
    if (localCursor != null) {
      paramFe = (Fe)localObject;
    }
    try
    {
      if (localCursor.moveToFirst()) {
        paramFe = localCursor.getString(localCursor.getColumnIndexOrThrow("_data"));
      }
      localCursor.close();
    }
    finally
    {
      localCursor.close();
    }
    paramFe = new StringBuilder();
    paramFe.append("Failed to find file path for: ");
    paramFe.append(this.c);
    parama.a(new FileNotFoundException(paramFe.toString()));
    return;
    parama.a(new File(paramFe));
  }
  
  public void b() {}
  
  public a c()
  {
    return a.a;
  }
  
  public void cancel() {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Zg$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */