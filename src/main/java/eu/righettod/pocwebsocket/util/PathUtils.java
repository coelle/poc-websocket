package eu.righettod.pocwebsocket.util;

import java.net.*;
import java.nio.file.*;
import java.util.*;

public class PathUtils {
	public static Path pathToResourceOf(final String file, final Class<?> clazz) throws URISyntaxException {
		return Paths.get(
				Objects.requireNonNull(clazz.getResource(file)).toURI()
		);
	}
}
