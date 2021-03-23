
//loads multiple buffers into an array by specifying the folder path

BuffersFolder : Buffer {

    *read {
		| path, startFrame= 0, numFrames= -1, action|
		var files;
        files = Array.new;


		PathName(path).entries.do ({
		arg path;
		files =  files.add(Buffer.read(Server.local, path.fullPath, startFrame, numFrames, action));
	});

		^files
    }


	*readChannel {
		| path, startFrame = 0, numFrames = -1, channels=1, action |
		var files;
        files = Array.new;

		PathName(path).entries.do ({
		arg path;
		files =  files.add(Buffer.readChannel(Server.local, path.fullPath, startFrame, numFrames, channels, action));
	});

		^files
    }

}

