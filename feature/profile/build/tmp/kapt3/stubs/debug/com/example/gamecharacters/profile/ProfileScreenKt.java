package com.example.gamecharacters.profile;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0007\u001a\b\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u001a&\u0010\r\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007\u00a8\u0006\u0013"}, d2 = {"ProfileContent", "", "name", "", "onSaveClicked", "Lkotlin/Function1;", "ProfileScreen", "ProfileScreenPreview", "createNotification", "Landroid/app/Notification;", "context", "Landroid/content/Context;", "sendNotification", "createNotificationChannelIfNotExists", "Landroid/app/NotificationManager;", "channelId", "channelName", "importance", "", "profile_debug"})
public final class ProfileScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void ProfileScreen() {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ProfileContent(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSaveClicked) {
    }
    
    @android.annotation.SuppressLint(value = {"ServiceCast"})
    private static final void sendNotification(android.content.Context context, java.lang.String name) {
    }
    
    private static final android.app.Notification createNotification(android.content.Context context, java.lang.String name) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public static final void createNotificationChannelIfNotExists(@org.jetbrains.annotations.NotNull
    android.app.NotificationManager $this$createNotificationChannelIfNotExists, @org.jetbrains.annotations.NotNull
    java.lang.String channelId, @org.jetbrains.annotations.NotNull
    java.lang.String channelName, int importance) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    public static final void ProfileScreenPreview() {
    }
}