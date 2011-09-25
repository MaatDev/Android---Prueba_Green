package ul.ceids.green;

import android.content.Intent;
import greendroid.app.GDApplication;

public class GDDemoApplication extends GDApplication{
	
	@Override
	public Class<?> getHomeActivityClass() {
		// TODO Auto-generated method stub
		return Actividad.class;
	}
	
	@Override
	public Intent getMainApplicationIntent() {
		// TODO Auto-generated method stub
		return new Intent(Intent.ACTION_DEFAULT);
	}

}
