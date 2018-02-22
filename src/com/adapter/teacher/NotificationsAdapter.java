package com.adapter.teacher;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.adapter.StudentSFOBeans;
import com.cloudstream.cslink.R;
import com.common.view.CircularImageView;
import com.widget.textstyle.MyTextView_Signika_Bold;
import com.widget.textstyle.MyTextView_Signika_Regular;

import java.util.ArrayList;

public class NotificationsAdapter extends BaseAdapter {
    ArrayList<StudentSFOBeans> mNotificationsList;

    ViewHolder holder;

    Context myc;

    public NotificationsAdapter(Context c, ArrayList<StudentSFOBeans> notificationsList) {
        myc = c;
        this.mNotificationsList = notificationsList;
    }

    public void updateReceiptsList(ArrayList<StudentSFOBeans> notificationsList) {
        this.mNotificationsList.clear();
        this.mNotificationsList.addAll(notificationsList);
        this.notifyDataSetChanged();
    }

    public int getCount() {
        //return mStudentList.size();
        return 10;
    }

    public Object getItem(int arg0) {
        return null;
    }

    public long getItemId(int position) {
        return position;
    }

    static class ViewHolder {
        MyTextView_Signika_Bold mTxtName;
        MyTextView_Signika_Regular mTxtClass, mTxtStatus;
        CircularImageView mImgStudentPhoto;
    }

    @Override
    public View getView(final int pos,  View convertview, ViewGroup arg2) {

        LayoutInflater li = (LayoutInflater) myc.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertview == null) {
            convertview = li.inflate(R.layout.notifications_list_item, null);

            holder = new ViewHolder();
            holder.mTxtName = (MyTextView_Signika_Bold) convertview.findViewById(R.id.textView_name);
            holder.mTxtClass = (MyTextView_Signika_Regular) convertview.findViewById(R.id.text_class);
            holder.mTxtStatus = (MyTextView_Signika_Regular) convertview.findViewById(R.id.textView_status);
            holder.mImgStudentPhoto = (CircularImageView) convertview.findViewById(R.id.student_photo);

            convertview.setTag(holder);
        } else {
            holder = (ViewHolder) convertview.getTag();
        }

//        holder.tachername.setText(mActivitiesList.get(pos).child_name );
//        holder.subject.setText(myc.getResources().getString(R.string.str_parent) + (Date.get(pos).parent_name.equals("null") ? "" : Date.get(pos).parent_name) );
//        if ( Date.get(pos).class_name != null && !Date.get(pos).class_name.isEmpty() ) {
//            holder.txtClass.setVisibility(View.VISIBLE);
//            holder.txtClass.setText(myc.getResources().getString(R.string.str_class)+ Date.get(pos).class_name);
//        }
//        ApplicationData.setProfileImg(holder.profile_pic, ApplicationData.web_server_url + "uploads/" + Date.get(pos).child_image, myc);
//
//        holder.txtBadge.setVisibility(View.VISIBLE);
//        if (Date.get(pos).badge == 0) {
//            holder.txtBadge.setVisibility(View.GONE);
//        } else if (Date.get(pos).badge < 10){
//            holder.txtBadge.setText(Date.get(pos).badge + "");
//        } else {
//            holder.txtBadge.setText("N");
//        }

        return convertview;
    }
}