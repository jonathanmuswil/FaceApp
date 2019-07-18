import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class jf
  extends hf<InputStream>
{
  private static final UriMatcher d = new UriMatcher(-1);
  
  static
  {
    d.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
    d.addURI("com.android.contacts", "contacts/lookup/*", 1);
    d.addURI("com.android.contacts", "contacts/#/photo", 2);
    d.addURI("com.android.contacts", "contacts/#", 3);
    d.addURI("com.android.contacts", "contacts/#/display_photo", 4);
    d.addURI("com.android.contacts", "phone_lookup/*", 5);
  }
  
  public jf(ContentResolver paramContentResolver, Uri paramUri)
  {
    super(paramContentResolver, paramUri);
  }
  
  private InputStream a(ContentResolver paramContentResolver, Uri paramUri)
  {
    return ContactsContract.Contacts.openContactPhotoInputStream(paramContentResolver, paramUri, true);
  }
  
  private InputStream b(Uri paramUri, ContentResolver paramContentResolver)
    throws FileNotFoundException
  {
    int i = d.match(paramUri);
    if (i != 1) {
      if (i != 3)
      {
        if (i != 5) {
          return paramContentResolver.openInputStream(paramUri);
        }
      }
      else {
        return a(paramContentResolver, paramUri);
      }
    }
    paramUri = ContactsContract.Contacts.lookupContact(paramContentResolver, paramUri);
    if (paramUri != null) {
      return a(paramContentResolver, paramUri);
    }
    throw new FileNotFoundException("Contact cannot be found");
  }
  
  protected InputStream a(Uri paramUri, ContentResolver paramContentResolver)
    throws FileNotFoundException
  {
    paramContentResolver = b(paramUri, paramContentResolver);
    if (paramContentResolver != null) {
      return paramContentResolver;
    }
    paramContentResolver = new StringBuilder();
    paramContentResolver.append("InputStream is null for ");
    paramContentResolver.append(paramUri);
    throw new FileNotFoundException(paramContentResolver.toString());
  }
  
  public Class<InputStream> a()
  {
    return InputStream.class;
  }
  
  protected void a(InputStream paramInputStream)
    throws IOException
  {
    paramInputStream.close();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */