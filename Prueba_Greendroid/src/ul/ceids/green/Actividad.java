package ul.ceids.green;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import greendroid.app.GDActivity;
import greendroid.widget.ActionBarItem;
import greendroid.widget.ActionBarItem.Type;
import greendroid.widget.QuickAction;
import greendroid.widget.QuickActionBar;
import greendroid.widget.QuickActionGrid;
import greendroid.widget.QuickActionWidget;
import greendroid.widget.QuickActionWidget.OnQuickActionClickListener;

public class Actividad extends GDActivity{

	private static final int LOCATE = 0;
	private static final int SHARE = 1;
	
	private QuickActionGrid quickbar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setActionBarContentView(R.layout.main);
		initActionBar();
		initQuickActionBar();
		
		
		findViewById(R.id.btn_hola).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(getApplicationContext(), OtraActividad.class));
				
			}
		});
		
	}	
	
	public void initActionBar(){
		
		addActionBarItem(Type.Locate, LOCATE);
		addActionBarItem(Type.Share, SHARE);
				
	}
	
	public void initQuickActionBar(){
		
	
		quickbar = new QuickActionGrid(this);
		
		quickbar.addQuickAction(new QuickAction(this, R.drawable.icon,R.string.gd_share));
		quickbar.addQuickAction(new QuickAction(this, R.drawable.icon,R.string.gd_share));
		quickbar.addQuickAction(new QuickAction(this, R.drawable.icon,R.string.gd_share));
		quickbar.addQuickAction(new QuickAction(this, R.drawable.icon,R.string.gd_share));
		quickbar.addQuickAction(new QuickAction(this, R.drawable.icon,R.string.gd_share));
		quickbar.addQuickAction(new QuickAction(this, R.drawable.icon,R.string.gd_share));
		
		quickbar.setOnQuickActionClickListener(new OnQuickActionClickListener() {
			
			@Override
			public void onQuickActionClicked(QuickActionWidget widget, int position) {
				
				Log.v("TAG"," Click hohoho ");
				
			}
		});
		
	}
	
	
	@Override
	public boolean onHandleActionBarItemClick(ActionBarItem item, int position) {
		
		switch(position){
			case LOCATE:
				quickbar.show(item.getItemView());
				break;
			case SHARE:
				break;
		}
		
		
		return true;
	}
	
	
}
