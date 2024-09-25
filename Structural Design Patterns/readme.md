Adapter Pattern (Structural)

The Adapter Pattern is used to make two incompatible interfaces work together. It acts as a bridge between two objects, allowing the client to interact with an
interface that it normally would not be compatible with.

Files:

MediaPlayer.java: Standard interface for playing media files.

AdvancedMediaPlayer.java: Specialized interface for advanced media formats like VLC and MP4.

VlcPlayer.java / Mp4Player.java: Concrete classes that implement AdvancedMediaPlayer.

VlcPlayer.java / Mp4Player.java: Concrete classes that implement AdvancedMediaPlayer.

MediaAdapter.java: Adapts AdvancedMediaPlayer to MediaPlayer so it can handle VLC and MP4 formats.

AudioPlayer.java: Implements MediaPlayer and uses MediaAdapter to play advanced formats.

Main.java: Demonstrates playing different media file types using the adapter.

Workflow:

The AudioPlayer can play mp3 files directly. For other formats like mp4 or vlc, it uses the MediaAdapter to convert the request into something the
AdvancedMediaPlayer can handle.

MediaAdapter takes an audio type and selects the correct AdvancedMediaPlayer to play the file.

The Main class demonstrates playing various formats and handling unsupported file types.

The Adapter Pattern is ideal when you have an existing class whose interface is incompatible with what you need but you cannot modify the existing class.
