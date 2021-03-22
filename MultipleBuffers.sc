
//loads multiple buffers into an array by specifying the folder path

MultipleBuffers : Buffer {

    *load {
		| path |
		var files;
        files = Array.new;

		PathName(path).entries.do ({
		arg path;
		files =  files.add(Buffer.read(Server.local, path.fullPath));
	});

		^files
    }

}

