/*
 * generated by Xtext 2.28.0
 */
package sing.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ABLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("sing/parser/antlr/internal/InternalABL.tokens");
	}
}