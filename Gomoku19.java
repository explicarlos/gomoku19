// programa: Juego de Gomoku en tablero 19x19
// versión: 20240424
// autor: Carlos Grasa Lambea

import javax.swing.*;

public class Gomoku19 extends javax.swing.JFrame implements ControlGomoku19 {

	public static void main(String[] args) {

		try {
			javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
			for (int idx=0; idx<installedLookAndFeels.length; idx++)
				if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
					javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
					break;
				}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Gomoku19.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Gomoku19.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Gomoku19.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Gomoku19.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Gomoku19().setVisible(true);
			}
		});
	}

	public Gomoku19() {
		initComponents();
		ejecutarControl();
	}
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		c100 = new javax.swing.JLabel();
		c101 = new javax.swing.JLabel();
		c102 = new javax.swing.JLabel();
		c103 = new javax.swing.JLabel();
		c104 = new javax.swing.JLabel();
		c105 = new javax.swing.JLabel();
		c106 = new javax.swing.JLabel();
		c107 = new javax.swing.JLabel();
		c108 = new javax.swing.JLabel();
		c109 = new javax.swing.JLabel();
		c110 = new javax.swing.JLabel();
		c111 = new javax.swing.JLabel();
		c112 = new javax.swing.JLabel();
		c113 = new javax.swing.JLabel();
		c114 = new javax.swing.JLabel();
		c115 = new javax.swing.JLabel();
		c116 = new javax.swing.JLabel();
		c117 = new javax.swing.JLabel();
		c118 = new javax.swing.JLabel();
		c119 = new javax.swing.JLabel();
		c120 = new javax.swing.JLabel();
		c121 = new javax.swing.JLabel();
		c122 = new javax.swing.JLabel();
		c123 = new javax.swing.JLabel();
		c124 = new javax.swing.JLabel();
		c125 = new javax.swing.JLabel();
		c126 = new javax.swing.JLabel();
		c127 = new javax.swing.JLabel();
		c128 = new javax.swing.JLabel();
		c129 = new javax.swing.JLabel();
		c130 = new javax.swing.JLabel();
		c131 = new javax.swing.JLabel();
		c132 = new javax.swing.JLabel();
		c133 = new javax.swing.JLabel();
		c134 = new javax.swing.JLabel();
		c135 = new javax.swing.JLabel();
		c136 = new javax.swing.JLabel();
		c137 = new javax.swing.JLabel();
		c138 = new javax.swing.JLabel();
		c139 = new javax.swing.JLabel();
		c140 = new javax.swing.JLabel();
		c141 = new javax.swing.JLabel();
		c142 = new javax.swing.JLabel();
		c143 = new javax.swing.JLabel();
		c144 = new javax.swing.JLabel();
		c145 = new javax.swing.JLabel();
		c146 = new javax.swing.JLabel();
		c147 = new javax.swing.JLabel();
		c148 = new javax.swing.JLabel();
		c149 = new javax.swing.JLabel();
		c150 = new javax.swing.JLabel();
		c151 = new javax.swing.JLabel();
		c152 = new javax.swing.JLabel();
		c153 = new javax.swing.JLabel();
		c154 = new javax.swing.JLabel();
		c155 = new javax.swing.JLabel();
		c156 = new javax.swing.JLabel();
		c157 = new javax.swing.JLabel();
		c158 = new javax.swing.JLabel();
		c159 = new javax.swing.JLabel();
		c160 = new javax.swing.JLabel();
		c161 = new javax.swing.JLabel();
		c162 = new javax.swing.JLabel();
		c163 = new javax.swing.JLabel();
		c164 = new javax.swing.JLabel();
		c165 = new javax.swing.JLabel();
		c166 = new javax.swing.JLabel();
		c167 = new javax.swing.JLabel();
		c168 = new javax.swing.JLabel();
		c169 = new javax.swing.JLabel();
		c170 = new javax.swing.JLabel();
		c171 = new javax.swing.JLabel();
		c172 = new javax.swing.JLabel();
		c173 = new javax.swing.JLabel();
		c174 = new javax.swing.JLabel();
		c175 = new javax.swing.JLabel();
		c176 = new javax.swing.JLabel();
		c177 = new javax.swing.JLabel();
		c178 = new javax.swing.JLabel();
		c179 = new javax.swing.JLabel();
		c180 = new javax.swing.JLabel();
		c181 = new javax.swing.JLabel();
		c182 = new javax.swing.JLabel();
		c183 = new javax.swing.JLabel();
		c184 = new javax.swing.JLabel();
		c185 = new javax.swing.JLabel();
		c186 = new javax.swing.JLabel();
		c187 = new javax.swing.JLabel();
		c188 = new javax.swing.JLabel();
		c189 = new javax.swing.JLabel();
		c190 = new javax.swing.JLabel();
		c191 = new javax.swing.JLabel();
		c192 = new javax.swing.JLabel();
		c193 = new javax.swing.JLabel();
		c194 = new javax.swing.JLabel();
		c195 = new javax.swing.JLabel();
		c196 = new javax.swing.JLabel();
		c197 = new javax.swing.JLabel();
		c198 = new javax.swing.JLabel();
		c199 = new javax.swing.JLabel();
		c200 = new javax.swing.JLabel();
		c201 = new javax.swing.JLabel();
		c202 = new javax.swing.JLabel();
		c203 = new javax.swing.JLabel();
		c204 = new javax.swing.JLabel();
		c205 = new javax.swing.JLabel();
		c206 = new javax.swing.JLabel();
		c207 = new javax.swing.JLabel();
		c208 = new javax.swing.JLabel();
		c209 = new javax.swing.JLabel();
		c210 = new javax.swing.JLabel();
		c211 = new javax.swing.JLabel();
		c212 = new javax.swing.JLabel();
		c213 = new javax.swing.JLabel();
		c214 = new javax.swing.JLabel();
		c215 = new javax.swing.JLabel();
		c216 = new javax.swing.JLabel();
		c217 = new javax.swing.JLabel();
		c218 = new javax.swing.JLabel();
		c219 = new javax.swing.JLabel();
		c220 = new javax.swing.JLabel();
		c221 = new javax.swing.JLabel();
		c222 = new javax.swing.JLabel();
		c223 = new javax.swing.JLabel();
		c224 = new javax.swing.JLabel();
		c225 = new javax.swing.JLabel();
		c226 = new javax.swing.JLabel();
		c227 = new javax.swing.JLabel();
		c228 = new javax.swing.JLabel();
		c229 = new javax.swing.JLabel();
		c230 = new javax.swing.JLabel();
		c231 = new javax.swing.JLabel();
		c232 = new javax.swing.JLabel();
		c233 = new javax.swing.JLabel();
		c234 = new javax.swing.JLabel();
		c235 = new javax.swing.JLabel();
		c236 = new javax.swing.JLabel();
		c237 = new javax.swing.JLabel();
		c238 = new javax.swing.JLabel();
		c239 = new javax.swing.JLabel();
		c240 = new javax.swing.JLabel();
		c241 = new javax.swing.JLabel();
		c242 = new javax.swing.JLabel();
		c243 = new javax.swing.JLabel();
		c244 = new javax.swing.JLabel();
		c245 = new javax.swing.JLabel();
		c246 = new javax.swing.JLabel();
		c247 = new javax.swing.JLabel();
		c248 = new javax.swing.JLabel();
		c249 = new javax.swing.JLabel();
		c250 = new javax.swing.JLabel();
		c251 = new javax.swing.JLabel();
		c252 = new javax.swing.JLabel();
		c253 = new javax.swing.JLabel();
		c254 = new javax.swing.JLabel();
		c255 = new javax.swing.JLabel();
		c256 = new javax.swing.JLabel();
		c257 = new javax.swing.JLabel();
		c258 = new javax.swing.JLabel();
		c259 = new javax.swing.JLabel();
		c260 = new javax.swing.JLabel();
		c261 = new javax.swing.JLabel();
		c262 = new javax.swing.JLabel();
		c263 = new javax.swing.JLabel();
		c264 = new javax.swing.JLabel();
		c265 = new javax.swing.JLabel();
		c266 = new javax.swing.JLabel();
		c267 = new javax.swing.JLabel();
		c268 = new javax.swing.JLabel();
		c269 = new javax.swing.JLabel();
		c270 = new javax.swing.JLabel();
		c271 = new javax.swing.JLabel();
		c272 = new javax.swing.JLabel();
		c273 = new javax.swing.JLabel();
		c274 = new javax.swing.JLabel();
		c275 = new javax.swing.JLabel();
		c276 = new javax.swing.JLabel();
		c277 = new javax.swing.JLabel();
		c278 = new javax.swing.JLabel();
		c279 = new javax.swing.JLabel();
		c280 = new javax.swing.JLabel();
		c281 = new javax.swing.JLabel();
		c282 = new javax.swing.JLabel();
		c283 = new javax.swing.JLabel();
		c284 = new javax.swing.JLabel();
		c285 = new javax.swing.JLabel();
		c286 = new javax.swing.JLabel();
		c287 = new javax.swing.JLabel();
		c288 = new javax.swing.JLabel();
		c289 = new javax.swing.JLabel();
		c290 = new javax.swing.JLabel();
		c291 = new javax.swing.JLabel();
		c292 = new javax.swing.JLabel();
		c293 = new javax.swing.JLabel();
		c294 = new javax.swing.JLabel();
		c295 = new javax.swing.JLabel();
		c296 = new javax.swing.JLabel();
		c297 = new javax.swing.JLabel();
		c298 = new javax.swing.JLabel();
		c299 = new javax.swing.JLabel();
		c300 = new javax.swing.JLabel();
		c301 = new javax.swing.JLabel();
		c302 = new javax.swing.JLabel();
		c303 = new javax.swing.JLabel();
		c304 = new javax.swing.JLabel();
		c305 = new javax.swing.JLabel();
		c306 = new javax.swing.JLabel();
		c307 = new javax.swing.JLabel();
		c308 = new javax.swing.JLabel();
		c309 = new javax.swing.JLabel();
		c310 = new javax.swing.JLabel();
		c311 = new javax.swing.JLabel();
		c312 = new javax.swing.JLabel();
		c313 = new javax.swing.JLabel();
		c314 = new javax.swing.JLabel();
		c315 = new javax.swing.JLabel();
		c316 = new javax.swing.JLabel();
		c317 = new javax.swing.JLabel();
		c318 = new javax.swing.JLabel();
		c319 = new javax.swing.JLabel();
		c320 = new javax.swing.JLabel();
		c321 = new javax.swing.JLabel();
		c322 = new javax.swing.JLabel();
		c323 = new javax.swing.JLabel();
		c324 = new javax.swing.JLabel();
		c325 = new javax.swing.JLabel();
		c326 = new javax.swing.JLabel();
		c327 = new javax.swing.JLabel();
		c328 = new javax.swing.JLabel();
		c329 = new javax.swing.JLabel();
		c330 = new javax.swing.JLabel();
		c331 = new javax.swing.JLabel();
		c332 = new javax.swing.JLabel();
		c333 = new javax.swing.JLabel();
		c334 = new javax.swing.JLabel();
		c335 = new javax.swing.JLabel();
		c336 = new javax.swing.JLabel();
		c337 = new javax.swing.JLabel();
		c338 = new javax.swing.JLabel();
		c339 = new javax.swing.JLabel();
		c340 = new javax.swing.JLabel();
		c341 = new javax.swing.JLabel();
		c342 = new javax.swing.JLabel();
		c343 = new javax.swing.JLabel();
		c344 = new javax.swing.JLabel();
		c345 = new javax.swing.JLabel();
		c346 = new javax.swing.JLabel();
		c347 = new javax.swing.JLabel();
		c348 = new javax.swing.JLabel();
		c349 = new javax.swing.JLabel();
		c350 = new javax.swing.JLabel();
		c351 = new javax.swing.JLabel();
		c352 = new javax.swing.JLabel();
		c353 = new javax.swing.JLabel();
		c354 = new javax.swing.JLabel();
		c355 = new javax.swing.JLabel();
		c356 = new javax.swing.JLabel();
		c357 = new javax.swing.JLabel();
		c358 = new javax.swing.JLabel();
		c359 = new javax.swing.JLabel();
		c360 = new javax.swing.JLabel();
		c361 = new javax.swing.JLabel();
		c362 = new javax.swing.JLabel();
		c363 = new javax.swing.JLabel();
		c364 = new javax.swing.JLabel();
		c365 = new javax.swing.JLabel();
		c366 = new javax.swing.JLabel();
		c367 = new javax.swing.JLabel();
		c368 = new javax.swing.JLabel();
		c369 = new javax.swing.JLabel();
		c370 = new javax.swing.JLabel();
		c371 = new javax.swing.JLabel();
		c372 = new javax.swing.JLabel();
		c373 = new javax.swing.JLabel();
		c374 = new javax.swing.JLabel();
		c375 = new javax.swing.JLabel();
		c376 = new javax.swing.JLabel();
		c377 = new javax.swing.JLabel();
		c378 = new javax.swing.JLabel();
		c379 = new javax.swing.JLabel();
		c380 = new javax.swing.JLabel();
		c381 = new javax.swing.JLabel();
		c382 = new javax.swing.JLabel();
		c383 = new javax.swing.JLabel();
		c384 = new javax.swing.JLabel();
		c385 = new javax.swing.JLabel();
		c386 = new javax.swing.JLabel();
		c387 = new javax.swing.JLabel();
		c388 = new javax.swing.JLabel();
		c389 = new javax.swing.JLabel();
		c390 = new javax.swing.JLabel();
		c391 = new javax.swing.JLabel();
		c392 = new javax.swing.JLabel();
		c393 = new javax.swing.JLabel();
		c394 = new javax.swing.JLabel();
		c395 = new javax.swing.JLabel();
		c396 = new javax.swing.JLabel();
		c397 = new javax.swing.JLabel();
		c398 = new javax.swing.JLabel();
		c399 = new javax.swing.JLabel();
		c400 = new javax.swing.JLabel();
		c401 = new javax.swing.JLabel();
		c402 = new javax.swing.JLabel();
		c403 = new javax.swing.JLabel();
		c404 = new javax.swing.JLabel();
		c405 = new javax.swing.JLabel();
		c406 = new javax.swing.JLabel();
		c407 = new javax.swing.JLabel();
		c408 = new javax.swing.JLabel();
		c409 = new javax.swing.JLabel();
		c410 = new javax.swing.JLabel();
		c411 = new javax.swing.JLabel();
		c412 = new javax.swing.JLabel();
		c413 = new javax.swing.JLabel();
		c414 = new javax.swing.JLabel();
		c415 = new javax.swing.JLabel();
		c416 = new javax.swing.JLabel();
		c417 = new javax.swing.JLabel();
		c418 = new javax.swing.JLabel();
		c419 = new javax.swing.JLabel();
		c420 = new javax.swing.JLabel();
		c421 = new javax.swing.JLabel();
		c422 = new javax.swing.JLabel();
		c423 = new javax.swing.JLabel();
		c424 = new javax.swing.JLabel();
		c425 = new javax.swing.JLabel();
		c426 = new javax.swing.JLabel();
		c427 = new javax.swing.JLabel();
		c428 = new javax.swing.JLabel();
		c429 = new javax.swing.JLabel();
		c430 = new javax.swing.JLabel();
		c431 = new javax.swing.JLabel();
		c432 = new javax.swing.JLabel();
		c433 = new javax.swing.JLabel();
		c434 = new javax.swing.JLabel();
		c435 = new javax.swing.JLabel();
		c436 = new javax.swing.JLabel();
		c437 = new javax.swing.JLabel();
		c438 = new javax.swing.JLabel();
		c439 = new javax.swing.JLabel();
		c440 = new javax.swing.JLabel();
		c441 = new javax.swing.JLabel();
		c442 = new javax.swing.JLabel();
		c443 = new javax.swing.JLabel();
		c444 = new javax.swing.JLabel();
		c445 = new javax.swing.JLabel();
		c446 = new javax.swing.JLabel();
		c447 = new javax.swing.JLabel();
		c448 = new javax.swing.JLabel();
		c449 = new javax.swing.JLabel();
		c450 = new javax.swing.JLabel();
		c451 = new javax.swing.JLabel();
		c452 = new javax.swing.JLabel();
		c453 = new javax.swing.JLabel();
		c454 = new javax.swing.JLabel();
		c455 = new javax.swing.JLabel();
		c456 = new javax.swing.JLabel();
		c457 = new javax.swing.JLabel();
		c458 = new javax.swing.JLabel();
		c459 = new javax.swing.JLabel();
		c460 = new javax.swing.JLabel();
		botonA = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		campoEstado = new javax.swing.JLabel();
		botonB = new javax.swing.JButton();
		botonC = new javax.swing.JButton();
		botonD = new javax.swing.JButton();

		FormListener formListener = new FormListener();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setAutoRequestFocus(false);
		setFocusCycleRoot(false);
		setMinimumSize(new java.awt.Dimension(450, 500));
		setPreferredSize(new java.awt.Dimension(440, 500));
		setResizable(false);
		setSize(new java.awt.Dimension(440, 500));

		jPanel1.setFocusable(false);
		jPanel1.setMaximumSize(new java.awt.Dimension(399, 399));
		jPanel1.setMinimumSize(new java.awt.Dimension(399, 399));
		jPanel1.setPreferredSize(new java.awt.Dimension(399, 399));
		jPanel1.setRequestFocusEnabled(false);
		jPanel1.setVerifyInputWhenFocusTarget(false);
		jPanel1.setLayout(null);

// ------------------------------ configurar casillas -----------------------------------------------

		c100.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c100.setFocusable(false);
		c100.setIconTextGap(0);
		c100.setInheritsPopupMenu(false);
		c100.setRequestFocusEnabled(false);
		c100.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c100);
		c100.setBounds(0, 0, 21, 21);

		c101.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c101.setFocusable(false);
		c101.setIconTextGap(0);
		c101.setInheritsPopupMenu(false);
		c101.setRequestFocusEnabled(false);
		c101.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c101);
		c101.setBounds(21, 0, 21, 21);

		c102.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c102.setFocusable(false);
		c102.setIconTextGap(0);
		c102.setInheritsPopupMenu(false);
		c102.setRequestFocusEnabled(false);
		c102.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c102);
		c102.setBounds(42, 0, 21, 21);

		c103.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c103.setFocusable(false);
		c103.setIconTextGap(0);
		c103.setInheritsPopupMenu(false);
		c103.setRequestFocusEnabled(false);
		c103.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c103);
		c103.setBounds(63, 0, 21, 21);

		c104.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c104.setFocusable(false);
		c104.setIconTextGap(0);
		c104.setInheritsPopupMenu(false);
		c104.setRequestFocusEnabled(false);
		c104.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c104);
		c104.setBounds(84, 0, 21, 21);

		c105.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c105.setFocusable(false);
		c105.setIconTextGap(0);
		c105.setInheritsPopupMenu(false);
		c105.setRequestFocusEnabled(false);
		c105.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c105);
		c105.setBounds(105, 0, 21, 21);

		c106.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c106.setFocusable(false);
		c106.setIconTextGap(0);
		c106.setInheritsPopupMenu(false);
		c106.setRequestFocusEnabled(false);
		c106.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c106);
		c106.setBounds(126, 0, 21, 21);

		c107.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c107.setFocusable(false);
		c107.setIconTextGap(0);
		c107.setInheritsPopupMenu(false);
		c107.setRequestFocusEnabled(false);
		c107.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c107);
		c107.setBounds(147, 0, 21, 21);

		c108.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c108.setFocusable(false);
		c108.setIconTextGap(0);
		c108.setInheritsPopupMenu(false);
		c108.setRequestFocusEnabled(false);
		c108.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c108);
		c108.setBounds(168, 0, 21, 21);

		c109.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c109.setFocusable(false);
		c109.setIconTextGap(0);
		c109.setInheritsPopupMenu(false);
		c109.setRequestFocusEnabled(false);
		c109.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c109);
		c109.setBounds(189, 0, 21, 21);

		c110.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c110.setFocusable(false);
		c110.setIconTextGap(0);
		c110.setInheritsPopupMenu(false);
		c110.setRequestFocusEnabled(false);
		c110.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c110);
		c110.setBounds(210, 0, 21, 21);

		c111.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c111.setFocusable(false);
		c111.setIconTextGap(0);
		c111.setInheritsPopupMenu(false);
		c111.setRequestFocusEnabled(false);
		c111.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c111);
		c111.setBounds(231, 0, 21, 21);

		c112.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c112.setFocusable(false);
		c112.setIconTextGap(0);
		c112.setInheritsPopupMenu(false);
		c112.setRequestFocusEnabled(false);
		c112.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c112);
		c112.setBounds(252, 0, 21, 21);

		c113.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c113.setFocusable(false);
		c113.setIconTextGap(0);
		c113.setInheritsPopupMenu(false);
		c113.setRequestFocusEnabled(false);
		c113.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c113);
		c113.setBounds(273, 0, 21, 21);

		c114.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c114.setFocusable(false);
		c114.setIconTextGap(0);
		c114.setInheritsPopupMenu(false);
		c114.setRequestFocusEnabled(false);
		c114.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c114);
		c114.setBounds(294, 0, 21, 21);

		c115.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c115.setFocusable(false);
		c115.setIconTextGap(0);
		c115.setInheritsPopupMenu(false);
		c115.setRequestFocusEnabled(false);
		c115.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c115);
		c115.setBounds(315, 0, 21, 21);

		c116.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c116.setFocusable(false);
		c116.setIconTextGap(0);
		c116.setInheritsPopupMenu(false);
		c116.setRequestFocusEnabled(false);
		c116.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c116);
		c116.setBounds(336, 0, 21, 21);

		c117.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c117.setFocusable(false);
		c117.setIconTextGap(0);
		c117.setInheritsPopupMenu(false);
		c117.setRequestFocusEnabled(false);
		c117.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c117);
		c117.setBounds(357, 0, 21, 21);

		c118.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c118.setFocusable(false);
		c118.setIconTextGap(0);
		c118.setInheritsPopupMenu(false);
		c118.setRequestFocusEnabled(false);
		c118.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c118);
		c118.setBounds(378, 0, 21, 21);

		c119.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c119.setFocusable(false);
		c119.setIconTextGap(0);
		c119.setInheritsPopupMenu(false);
		c119.setRequestFocusEnabled(false);
		c119.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c119);
		c119.setBounds(0, 21, 21, 21);

		c120.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c120.setFocusable(false);
		c120.setIconTextGap(0);
		c120.setInheritsPopupMenu(false);
		c120.setRequestFocusEnabled(false);
		c120.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c120);
		c120.setBounds(21, 21, 21, 21);

		c121.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c121.setFocusable(false);
		c121.setIconTextGap(0);
		c121.setInheritsPopupMenu(false);
		c121.setRequestFocusEnabled(false);
		c121.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c121);
		c121.setBounds(42, 21, 21, 21);

		c122.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c122.setFocusable(false);
		c122.setIconTextGap(0);
		c122.setInheritsPopupMenu(false);
		c122.setRequestFocusEnabled(false);
		c122.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c122);
		c122.setBounds(63, 21, 21, 21);

		c123.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c123.setFocusable(false);
		c123.setIconTextGap(0);
		c123.setInheritsPopupMenu(false);
		c123.setRequestFocusEnabled(false);
		c123.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c123);
		c123.setBounds(84, 21, 21, 21);

		c124.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c124.setFocusable(false);
		c124.setIconTextGap(0);
		c124.setInheritsPopupMenu(false);
		c124.setRequestFocusEnabled(false);
		c124.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c124);
		c124.setBounds(105, 21, 21, 21);

		c125.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c125.setFocusable(false);
		c125.setIconTextGap(0);
		c125.setInheritsPopupMenu(false);
		c125.setRequestFocusEnabled(false);
		c125.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c125);
		c125.setBounds(126, 21, 21, 21);

		c126.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c126.setFocusable(false);
		c126.setIconTextGap(0);
		c126.setInheritsPopupMenu(false);
		c126.setRequestFocusEnabled(false);
		c126.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c126);
		c126.setBounds(147, 21, 21, 21);

		c127.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c127.setFocusable(false);
		c127.setIconTextGap(0);
		c127.setInheritsPopupMenu(false);
		c127.setRequestFocusEnabled(false);
		c127.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c127);
		c127.setBounds(168, 21, 21, 21);

		c128.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c128.setFocusable(false);
		c128.setIconTextGap(0);
		c128.setInheritsPopupMenu(false);
		c128.setRequestFocusEnabled(false);
		c128.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c128);
		c128.setBounds(189, 21, 21, 21);

		c129.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c129.setFocusable(false);
		c129.setIconTextGap(0);
		c129.setInheritsPopupMenu(false);
		c129.setRequestFocusEnabled(false);
		c129.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c129);
		c129.setBounds(210, 21, 21, 21);

		c130.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c130.setFocusable(false);
		c130.setIconTextGap(0);
		c130.setInheritsPopupMenu(false);
		c130.setRequestFocusEnabled(false);
		c130.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c130);
		c130.setBounds(231, 21, 21, 21);

		c131.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c131.setFocusable(false);
		c131.setIconTextGap(0);
		c131.setInheritsPopupMenu(false);
		c131.setRequestFocusEnabled(false);
		c131.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c131);
		c131.setBounds(252, 21, 21, 21);

		c132.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c132.setFocusable(false);
		c132.setIconTextGap(0);
		c132.setInheritsPopupMenu(false);
		c132.setRequestFocusEnabled(false);
		c132.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c132);
		c132.setBounds(273, 21, 21, 21);

		c133.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c133.setFocusable(false);
		c133.setIconTextGap(0);
		c133.setInheritsPopupMenu(false);
		c133.setRequestFocusEnabled(false);
		c133.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c133);
		c133.setBounds(294, 21, 21, 21);

		c134.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c134.setFocusable(false);
		c134.setIconTextGap(0);
		c134.setInheritsPopupMenu(false);
		c134.setRequestFocusEnabled(false);
		c134.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c134);
		c134.setBounds(315, 21, 21, 21);

		c135.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c135.setFocusable(false);
		c135.setIconTextGap(0);
		c135.setInheritsPopupMenu(false);
		c135.setRequestFocusEnabled(false);
		c135.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c135);
		c135.setBounds(336, 21, 21, 21);

		c136.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c136.setFocusable(false);
		c136.setIconTextGap(0);
		c136.setInheritsPopupMenu(false);
		c136.setRequestFocusEnabled(false);
		c136.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c136);
		c136.setBounds(357, 21, 21, 21);

		c137.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c137.setFocusable(false);
		c137.setIconTextGap(0);
		c137.setInheritsPopupMenu(false);
		c137.setRequestFocusEnabled(false);
		c137.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c137);
		c137.setBounds(378, 21, 21, 21);

		c138.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c138.setFocusable(false);
		c138.setIconTextGap(0);
		c138.setInheritsPopupMenu(false);
		c138.setRequestFocusEnabled(false);
		c138.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c138);
		c138.setBounds(0, 42, 21, 21);

		c139.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c139.setFocusable(false);
		c139.setIconTextGap(0);
		c139.setInheritsPopupMenu(false);
		c139.setRequestFocusEnabled(false);
		c139.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c139);
		c139.setBounds(21, 42, 21, 21);

		c140.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c140.setFocusable(false);
		c140.setIconTextGap(0);
		c140.setInheritsPopupMenu(false);
		c140.setRequestFocusEnabled(false);
		c140.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c140);
		c140.setBounds(42, 42, 21, 21);

		c141.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c141.setFocusable(false);
		c141.setIconTextGap(0);
		c141.setInheritsPopupMenu(false);
		c141.setRequestFocusEnabled(false);
		c141.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c141);
		c141.setBounds(63, 42, 21, 21);

		c142.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c142.setFocusable(false);
		c142.setIconTextGap(0);
		c142.setInheritsPopupMenu(false);
		c142.setRequestFocusEnabled(false);
		c142.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c142);
		c142.setBounds(84, 42, 21, 21);

		c143.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c143.setFocusable(false);
		c143.setIconTextGap(0);
		c143.setInheritsPopupMenu(false);
		c143.setRequestFocusEnabled(false);
		c143.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c143);
		c143.setBounds(105, 42, 21, 21);

		c144.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c144.setFocusable(false);
		c144.setIconTextGap(0);
		c144.setInheritsPopupMenu(false);
		c144.setRequestFocusEnabled(false);
		c144.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c144);
		c144.setBounds(126, 42, 21, 21);

		c145.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c145.setFocusable(false);
		c145.setIconTextGap(0);
		c145.setInheritsPopupMenu(false);
		c145.setRequestFocusEnabled(false);
		c145.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c145);
		c145.setBounds(147, 42, 21, 21);

		c146.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c146.setFocusable(false);
		c146.setIconTextGap(0);
		c146.setInheritsPopupMenu(false);
		c146.setRequestFocusEnabled(false);
		c146.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c146);
		c146.setBounds(168, 42, 21, 21);

		c147.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c147.setFocusable(false);
		c147.setIconTextGap(0);
		c147.setInheritsPopupMenu(false);
		c147.setRequestFocusEnabled(false);
		c147.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c147);
		c147.setBounds(189, 42, 21, 21);

		c148.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c148.setFocusable(false);
		c148.setIconTextGap(0);
		c148.setInheritsPopupMenu(false);
		c148.setRequestFocusEnabled(false);
		c148.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c148);
		c148.setBounds(210, 42, 21, 21);

		c149.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c149.setFocusable(false);
		c149.setIconTextGap(0);
		c149.setInheritsPopupMenu(false);
		c149.setRequestFocusEnabled(false);
		c149.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c149);
		c149.setBounds(231, 42, 21, 21);

		c150.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c150.setFocusable(false);
		c150.setIconTextGap(0);
		c150.setInheritsPopupMenu(false);
		c150.setRequestFocusEnabled(false);
		c150.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c150);
		c150.setBounds(252, 42, 21, 21);

		c151.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c151.setFocusable(false);
		c151.setIconTextGap(0);
		c151.setInheritsPopupMenu(false);
		c151.setRequestFocusEnabled(false);
		c151.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c151);
		c151.setBounds(273, 42, 21, 21);

		c152.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c152.setFocusable(false);
		c152.setIconTextGap(0);
		c152.setInheritsPopupMenu(false);
		c152.setRequestFocusEnabled(false);
		c152.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c152);
		c152.setBounds(294, 42, 21, 21);

		c153.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c153.setFocusable(false);
		c153.setIconTextGap(0);
		c153.setInheritsPopupMenu(false);
		c153.setRequestFocusEnabled(false);
		c153.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c153);
		c153.setBounds(315, 42, 21, 21);

		c154.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c154.setFocusable(false);
		c154.setIconTextGap(0);
		c154.setInheritsPopupMenu(false);
		c154.setRequestFocusEnabled(false);
		c154.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c154);
		c154.setBounds(336, 42, 21, 21);

		c155.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c155.setFocusable(false);
		c155.setIconTextGap(0);
		c155.setInheritsPopupMenu(false);
		c155.setRequestFocusEnabled(false);
		c155.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c155);
		c155.setBounds(357, 42, 21, 21);

		c156.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c156.setFocusable(false);
		c156.setIconTextGap(0);
		c156.setInheritsPopupMenu(false);
		c156.setRequestFocusEnabled(false);
		c156.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c156);
		c156.setBounds(378, 42, 21, 21);

		c157.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c157.setFocusable(false);
		c157.setIconTextGap(0);
		c157.setInheritsPopupMenu(false);
		c157.setRequestFocusEnabled(false);
		c157.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c157);
		c157.setBounds(0, 63, 21, 21);

		c158.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c158.setFocusable(false);
		c158.setIconTextGap(0);
		c158.setInheritsPopupMenu(false);
		c158.setRequestFocusEnabled(false);
		c158.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c158);
		c158.setBounds(84, 63, 21, 21);

		c159.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c159.setFocusable(false);
		c159.setIconTextGap(0);
		c159.setInheritsPopupMenu(false);
		c159.setRequestFocusEnabled(false);
		c159.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c159);
		c159.setBounds(126, 63, 21, 21);

		c160.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c160.setFocusable(false);
		c160.setIconTextGap(0);
		c160.setInheritsPopupMenu(false);
		c160.setRequestFocusEnabled(false);
		c160.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c160);
		c160.setBounds(210, 63, 21, 21);

		c161.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c161.setFocusable(false);
		c161.setIconTextGap(0);
		c161.setInheritsPopupMenu(false);
		c161.setRequestFocusEnabled(false);
		c161.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c161);
		c161.setBounds(231, 63, 21, 21);

		c162.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c162.setFocusable(false);
		c162.setIconTextGap(0);
		c162.setInheritsPopupMenu(false);
		c162.setRequestFocusEnabled(false);
		c162.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c162);
		c162.setBounds(336, 63, 21, 21);

		c163.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c163.setFocusable(false);
		c163.setIconTextGap(0);
		c163.setInheritsPopupMenu(false);
		c163.setRequestFocusEnabled(false);
		c163.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c163);
		c163.setBounds(315, 63, 21, 21);

		c164.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c164.setFocusable(false);
		c164.setIconTextGap(0);
		c164.setInheritsPopupMenu(false);
		c164.setRequestFocusEnabled(false);
		c164.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c164);
		c164.setBounds(147, 63, 21, 21);

		c165.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c165.setFocusable(false);
		c165.setIconTextGap(0);
		c165.setInheritsPopupMenu(false);
		c165.setRequestFocusEnabled(false);
		c165.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c165);
		c165.setBounds(42, 63, 21, 21);

		c166.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c166.setFocusable(false);
		c166.setIconTextGap(0);
		c166.setInheritsPopupMenu(false);
		c166.setRequestFocusEnabled(false);
		c166.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c166);
		c166.setBounds(294, 63, 21, 21);

		c167.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c167.setFocusable(false);
		c167.setIconTextGap(0);
		c167.setInheritsPopupMenu(false);
		c167.setRequestFocusEnabled(false);
		c167.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c167);
		c167.setBounds(21, 63, 21, 21);

		c168.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c168.setFocusable(false);
		c168.setIconTextGap(0);
		c168.setInheritsPopupMenu(false);
		c168.setRequestFocusEnabled(false);
		c168.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c168);
		c168.setBounds(252, 63, 21, 21);

		c169.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c169.setFocusable(false);
		c169.setIconTextGap(0);
		c169.setInheritsPopupMenu(false);
		c169.setRequestFocusEnabled(false);
		c169.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c169);
		c169.setBounds(105, 63, 21, 21);

		c170.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c170.setFocusable(false);
		c170.setIconTextGap(0);
		c170.setInheritsPopupMenu(false);
		c170.setRequestFocusEnabled(false);
		c170.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c170);
		c170.setBounds(273, 63, 21, 21);

		c171.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c171.setFocusable(false);
		c171.setIconTextGap(0);
		c171.setInheritsPopupMenu(false);
		c171.setRequestFocusEnabled(false);
		c171.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c171);
		c171.setBounds(378, 63, 21, 21);

		c172.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c172.setFocusable(false);
		c172.setIconTextGap(0);
		c172.setInheritsPopupMenu(false);
		c172.setRequestFocusEnabled(false);
		c172.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c172);
		c172.setBounds(168, 63, 21, 21);

		c173.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c173.setFocusable(false);
		c173.setIconTextGap(0);
		c173.setInheritsPopupMenu(false);
		c173.setRequestFocusEnabled(false);
		c173.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c173);
		c173.setBounds(189, 63, 21, 21);

		c174.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c174.setFocusable(false);
		c174.setIconTextGap(0);
		c174.setInheritsPopupMenu(false);
		c174.setRequestFocusEnabled(false);
		c174.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c174);
		c174.setBounds(357, 63, 21, 21);

		c175.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c175.setFocusable(false);
		c175.setIconTextGap(0);
		c175.setInheritsPopupMenu(false);
		c175.setRequestFocusEnabled(false);
		c175.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c175);
		c175.setBounds(63, 63, 21, 21);

		c176.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c176.setFocusable(false);
		c176.setIconTextGap(0);
		c176.setInheritsPopupMenu(false);
		c176.setRequestFocusEnabled(false);
		c176.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c176);
		c176.setBounds(147, 84, 21, 21);

		c177.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c177.setFocusable(false);
		c177.setIconTextGap(0);
		c177.setInheritsPopupMenu(false);
		c177.setRequestFocusEnabled(false);
		c177.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c177);
		c177.setBounds(42, 84, 21, 21);

		c178.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c178.setFocusable(false);
		c178.setIconTextGap(0);
		c178.setInheritsPopupMenu(false);
		c178.setRequestFocusEnabled(false);
		c178.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c178);
		c178.setBounds(105, 84, 21, 21);

		c179.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c179.setFocusable(false);
		c179.setIconTextGap(0);
		c179.setInheritsPopupMenu(false);
		c179.setRequestFocusEnabled(false);
		c179.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c179);
		c179.setBounds(168, 84, 21, 21);

		c180.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c180.setFocusable(false);
		c180.setIconTextGap(0);
		c180.setInheritsPopupMenu(false);
		c180.setRequestFocusEnabled(false);
		c180.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c180);
		c180.setBounds(336, 84, 21, 21);

		c181.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c181.setFocusable(false);
		c181.setIconTextGap(0);
		c181.setInheritsPopupMenu(false);
		c181.setRequestFocusEnabled(false);
		c181.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c181);
		c181.setBounds(273, 84, 21, 21);

		c182.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c182.setFocusable(false);
		c182.setIconTextGap(0);
		c182.setInheritsPopupMenu(false);
		c182.setRequestFocusEnabled(false);
		c182.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c182);
		c182.setBounds(315, 84, 21, 21);

		c183.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c183.setFocusable(false);
		c183.setIconTextGap(0);
		c183.setInheritsPopupMenu(false);
		c183.setRequestFocusEnabled(false);
		c183.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c183);
		c183.setBounds(252, 84, 21, 21);

		c184.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c184.setFocusable(false);
		c184.setIconTextGap(0);
		c184.setInheritsPopupMenu(false);
		c184.setRequestFocusEnabled(false);
		c184.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c184);
		c184.setBounds(378, 84, 21, 21);

		c185.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c185.setFocusable(false);
		c185.setIconTextGap(0);
		c185.setInheritsPopupMenu(false);
		c185.setRequestFocusEnabled(false);
		c185.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c185);
		c185.setBounds(21, 84, 21, 21);

		c186.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c186.setFocusable(false);
		c186.setIconTextGap(0);
		c186.setInheritsPopupMenu(false);
		c186.setRequestFocusEnabled(false);
		c186.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c186);
		c186.setBounds(84, 84, 21, 21);

		c187.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c187.setFocusable(false);
		c187.setIconTextGap(0);
		c187.setInheritsPopupMenu(false);
		c187.setRequestFocusEnabled(false);
		c187.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c187);
		c187.setBounds(126, 84, 21, 21);

		c188.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c188.setFocusable(false);
		c188.setIconTextGap(0);
		c188.setInheritsPopupMenu(false);
		c188.setRequestFocusEnabled(false);
		c188.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c188);
		c188.setBounds(189, 84, 21, 21);

		c189.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c189.setFocusable(false);
		c189.setIconTextGap(0);
		c189.setInheritsPopupMenu(false);
		c189.setRequestFocusEnabled(false);
		c189.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c189);
		c189.setBounds(294, 84, 21, 21);

		c190.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c190.setFocusable(false);
		c190.setIconTextGap(0);
		c190.setInheritsPopupMenu(false);
		c190.setRequestFocusEnabled(false);
		c190.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c190);
		c190.setBounds(357, 84, 21, 21);

		c191.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c191.setFocusable(false);
		c191.setIconTextGap(0);
		c191.setInheritsPopupMenu(false);
		c191.setRequestFocusEnabled(false);
		c191.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c191);
		c191.setBounds(0, 84, 21, 21);

		c192.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c192.setFocusable(false);
		c192.setIconTextGap(0);
		c192.setInheritsPopupMenu(false);
		c192.setRequestFocusEnabled(false);
		c192.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c192);
		c192.setBounds(231, 84, 21, 21);

		c193.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c193.setFocusable(false);
		c193.setIconTextGap(0);
		c193.setInheritsPopupMenu(false);
		c193.setRequestFocusEnabled(false);
		c193.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c193);
		c193.setBounds(63, 84, 21, 21);

		c194.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c194.setFocusable(false);
		c194.setIconTextGap(0);
		c194.setInheritsPopupMenu(false);
		c194.setRequestFocusEnabled(false);
		c194.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c194);
		c194.setBounds(210, 84, 21, 21);

		c195.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c195.setFocusable(false);
		c195.setIconTextGap(0);
		c195.setInheritsPopupMenu(false);
		c195.setRequestFocusEnabled(false);
		c195.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c195);
		c195.setBounds(147, 105, 21, 21);

		c196.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c196.setFocusable(false);
		c196.setIconTextGap(0);
		c196.setInheritsPopupMenu(false);
		c196.setRequestFocusEnabled(false);
		c196.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c196);
		c196.setBounds(252, 105, 21, 21);

		c197.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c197.setFocusable(false);
		c197.setIconTextGap(0);
		c197.setInheritsPopupMenu(false);
		c197.setRequestFocusEnabled(false);
		c197.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c197);
		c197.setBounds(294, 105, 21, 21);

		c198.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c198.setFocusable(false);
		c198.setIconTextGap(0);
		c198.setInheritsPopupMenu(false);
		c198.setRequestFocusEnabled(false);
		c198.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c198);
		c198.setBounds(231, 105, 21, 21);

		c199.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c199.setFocusable(false);
		c199.setIconTextGap(0);
		c199.setInheritsPopupMenu(false);
		c199.setRequestFocusEnabled(false);
		c199.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c199);
		c199.setBounds(42, 105, 21, 21);

		c200.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c200.setFocusable(false);
		c200.setIconTextGap(0);
		c200.setInheritsPopupMenu(false);
		c200.setRequestFocusEnabled(false);
		c200.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c200);
		c200.setBounds(273, 105, 21, 21);

		c201.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c201.setFocusable(false);
		c201.setIconTextGap(0);
		c201.setInheritsPopupMenu(false);
		c201.setRequestFocusEnabled(false);
		c201.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c201);
		c201.setBounds(378, 105, 21, 21);

		c202.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c202.setFocusable(false);
		c202.setIconTextGap(0);
		c202.setInheritsPopupMenu(false);
		c202.setRequestFocusEnabled(false);
		c202.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c202);
		c202.setBounds(63, 105, 21, 21);

		c203.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c203.setFocusable(false);
		c203.setIconTextGap(0);
		c203.setInheritsPopupMenu(false);
		c203.setRequestFocusEnabled(false);
		c203.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c203);
		c203.setBounds(336, 105, 21, 21);

		c204.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c204.setFocusable(false);
		c204.setIconTextGap(0);
		c204.setInheritsPopupMenu(false);
		c204.setRequestFocusEnabled(false);
		c204.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c204);
		c204.setBounds(357, 105, 21, 21);

		c205.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c205.setFocusable(false);
		c205.setIconTextGap(0);
		c205.setInheritsPopupMenu(false);
		c205.setRequestFocusEnabled(false);
		c205.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c205);
		c205.setBounds(189, 105, 21, 21);

		c206.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c206.setFocusable(false);
		c206.setIconTextGap(0);
		c206.setInheritsPopupMenu(false);
		c206.setRequestFocusEnabled(false);
		c206.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c206);
		c206.setBounds(0, 105, 21, 21);

		c207.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c207.setFocusable(false);
		c207.setIconTextGap(0);
		c207.setInheritsPopupMenu(false);
		c207.setRequestFocusEnabled(false);
		c207.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c207);
		c207.setBounds(168, 105, 21, 21);

		c208.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c208.setFocusable(false);
		c208.setIconTextGap(0);
		c208.setInheritsPopupMenu(false);
		c208.setRequestFocusEnabled(false);
		c208.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c208);
		c208.setBounds(210, 105, 21, 21);

		c209.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c209.setFocusable(false);
		c209.setIconTextGap(0);
		c209.setInheritsPopupMenu(false);
		c209.setRequestFocusEnabled(false);
		c209.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c209);
		c209.setBounds(315, 105, 21, 21);

		c210.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c210.setFocusable(false);
		c210.setIconTextGap(0);
		c210.setInheritsPopupMenu(false);
		c210.setRequestFocusEnabled(false);
		c210.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c210);
		c210.setBounds(21, 105, 21, 21);

		c211.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c211.setFocusable(false);
		c211.setIconTextGap(0);
		c211.setInheritsPopupMenu(false);
		c211.setRequestFocusEnabled(false);
		c211.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c211);
		c211.setBounds(126, 105, 21, 21);

		c212.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c212.setFocusable(false);
		c212.setIconTextGap(0);
		c212.setInheritsPopupMenu(false);
		c212.setRequestFocusEnabled(false);
		c212.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c212);
		c212.setBounds(105, 105, 21, 21);

		c213.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c213.setFocusable(false);
		c213.setIconTextGap(0);
		c213.setInheritsPopupMenu(false);
		c213.setRequestFocusEnabled(false);
		c213.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c213);
		c213.setBounds(84, 105, 21, 21);

		c214.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c214.setFocusable(false);
		c214.setIconTextGap(0);
		c214.setInheritsPopupMenu(false);
		c214.setRequestFocusEnabled(false);
		c214.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c214);
		c214.setBounds(84, 126, 21, 21);

		c215.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c215.setFocusable(false);
		c215.setIconTextGap(0);
		c215.setInheritsPopupMenu(false);
		c215.setRequestFocusEnabled(false);
		c215.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c215);
		c215.setBounds(105, 126, 21, 21);

		c216.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c216.setFocusable(false);
		c216.setIconTextGap(0);
		c216.setInheritsPopupMenu(false);
		c216.setRequestFocusEnabled(false);
		c216.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c216);
		c216.setBounds(42, 126, 21, 21);

		c217.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c217.setFocusable(false);
		c217.setIconTextGap(0);
		c217.setInheritsPopupMenu(false);
		c217.setRequestFocusEnabled(false);
		c217.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c217);
		c217.setBounds(378, 126, 21, 21);

		c218.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c218.setFocusable(false);
		c218.setIconTextGap(0);
		c218.setInheritsPopupMenu(false);
		c218.setRequestFocusEnabled(false);
		c218.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c218);
		c218.setBounds(189, 126, 21, 21);

		c219.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c219.setFocusable(false);
		c219.setIconTextGap(0);
		c219.setInheritsPopupMenu(false);
		c219.setRequestFocusEnabled(false);
		c219.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c219);
		c219.setBounds(294, 126, 21, 21);

		c220.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c220.setFocusable(false);
		c220.setIconTextGap(0);
		c220.setInheritsPopupMenu(false);
		c220.setRequestFocusEnabled(false);
		c220.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c220);
		c220.setBounds(126, 126, 21, 21);

		c221.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c221.setFocusable(false);
		c221.setIconTextGap(0);
		c221.setInheritsPopupMenu(false);
		c221.setRequestFocusEnabled(false);
		c221.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c221);
		c221.setBounds(231, 126, 21, 21);

		c222.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c222.setFocusable(false);
		c222.setIconTextGap(0);
		c222.setInheritsPopupMenu(false);
		c222.setRequestFocusEnabled(false);
		c222.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c222);
		c222.setBounds(0, 126, 21, 21);

		c223.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c223.setFocusable(false);
		c223.setIconTextGap(0);
		c223.setInheritsPopupMenu(false);
		c223.setRequestFocusEnabled(false);
		c223.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c223);
		c223.setBounds(336, 126, 21, 21);

		c224.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c224.setFocusable(false);
		c224.setIconTextGap(0);
		c224.setInheritsPopupMenu(false);
		c224.setRequestFocusEnabled(false);
		c224.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c224);
		c224.setBounds(357, 126, 21, 21);

		c225.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c225.setFocusable(false);
		c225.setIconTextGap(0);
		c225.setInheritsPopupMenu(false);
		c225.setRequestFocusEnabled(false);
		c225.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c225);
		c225.setBounds(21, 126, 21, 21);

		c226.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c226.setFocusable(false);
		c226.setIconTextGap(0);
		c226.setInheritsPopupMenu(false);
		c226.setRequestFocusEnabled(false);
		c226.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c226);
		c226.setBounds(252, 126, 21, 21);

		c227.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c227.setFocusable(false);
		c227.setIconTextGap(0);
		c227.setInheritsPopupMenu(false);
		c227.setRequestFocusEnabled(false);
		c227.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c227);
		c227.setBounds(63, 126, 21, 21);

		c228.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c228.setFocusable(false);
		c228.setIconTextGap(0);
		c228.setInheritsPopupMenu(false);
		c228.setRequestFocusEnabled(false);
		c228.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c228);
		c228.setBounds(147, 126, 21, 21);

		c229.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c229.setFocusable(false);
		c229.setIconTextGap(0);
		c229.setInheritsPopupMenu(false);
		c229.setRequestFocusEnabled(false);
		c229.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c229);
		c229.setBounds(315, 126, 21, 21);

		c230.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c230.setFocusable(false);
		c230.setIconTextGap(0);
		c230.setInheritsPopupMenu(false);
		c230.setRequestFocusEnabled(false);
		c230.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c230);
		c230.setBounds(273, 126, 21, 21);

		c231.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c231.setFocusable(false);
		c231.setIconTextGap(0);
		c231.setInheritsPopupMenu(false);
		c231.setRequestFocusEnabled(false);
		c231.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c231);
		c231.setBounds(168, 126, 21, 21);

		c232.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c232.setFocusable(false);
		c232.setIconTextGap(0);
		c232.setInheritsPopupMenu(false);
		c232.setRequestFocusEnabled(false);
		c232.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c232);
		c232.setBounds(210, 126, 21, 21);

		c233.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c233.setFocusable(false);
		c233.setIconTextGap(0);
		c233.setInheritsPopupMenu(false);
		c233.setRequestFocusEnabled(false);
		c233.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c233);
		c233.setBounds(231, 147, 21, 21);

		c234.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c234.setFocusable(false);
		c234.setIconTextGap(0);
		c234.setInheritsPopupMenu(false);
		c234.setRequestFocusEnabled(false);
		c234.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c234);
		c234.setBounds(21, 147, 21, 21);

		c235.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c235.setFocusable(false);
		c235.setIconTextGap(0);
		c235.setInheritsPopupMenu(false);
		c235.setRequestFocusEnabled(false);
		c235.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c235);
		c235.setBounds(294, 147, 21, 21);

		c236.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c236.setFocusable(false);
		c236.setIconTextGap(0);
		c236.setInheritsPopupMenu(false);
		c236.setRequestFocusEnabled(false);
		c236.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c236);
		c236.setBounds(42, 147, 21, 21);

		c237.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c237.setFocusable(false);
		c237.setIconTextGap(0);
		c237.setInheritsPopupMenu(false);
		c237.setRequestFocusEnabled(false);
		c237.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c237);
		c237.setBounds(126, 147, 21, 21);

		c238.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c238.setFocusable(false);
		c238.setIconTextGap(0);
		c238.setInheritsPopupMenu(false);
		c238.setRequestFocusEnabled(false);
		c238.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c238);
		c238.setBounds(315, 147, 21, 21);

		c239.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c239.setFocusable(false);
		c239.setIconTextGap(0);
		c239.setInheritsPopupMenu(false);
		c239.setRequestFocusEnabled(false);
		c239.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c239);
		c239.setBounds(168, 147, 21, 21);

		c240.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c240.setFocusable(false);
		c240.setIconTextGap(0);
		c240.setInheritsPopupMenu(false);
		c240.setRequestFocusEnabled(false);
		c240.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c240);
		c240.setBounds(84, 147, 21, 21);

		c241.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c241.setFocusable(false);
		c241.setIconTextGap(0);
		c241.setInheritsPopupMenu(false);
		c241.setRequestFocusEnabled(false);
		c241.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c241);
		c241.setBounds(0, 147, 21, 21);

		c242.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c242.setFocusable(false);
		c242.setIconTextGap(0);
		c242.setInheritsPopupMenu(false);
		c242.setRequestFocusEnabled(false);
		c242.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c242);
		c242.setBounds(147, 147, 21, 21);

		c243.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c243.setFocusable(false);
		c243.setIconTextGap(0);
		c243.setInheritsPopupMenu(false);
		c243.setRequestFocusEnabled(false);
		c243.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c243);
		c243.setBounds(378, 147, 21, 21);

		c244.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c244.setFocusable(false);
		c244.setIconTextGap(0);
		c244.setInheritsPopupMenu(false);
		c244.setRequestFocusEnabled(false);
		c244.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c244);
		c244.setBounds(336, 147, 21, 21);

		c245.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c245.setFocusable(false);
		c245.setIconTextGap(0);
		c245.setInheritsPopupMenu(false);
		c245.setRequestFocusEnabled(false);
		c245.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c245);
		c245.setBounds(357, 147, 21, 21);

		c246.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c246.setFocusable(false);
		c246.setIconTextGap(0);
		c246.setInheritsPopupMenu(false);
		c246.setRequestFocusEnabled(false);
		c246.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c246);
		c246.setBounds(63, 147, 21, 21);

		c247.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c247.setFocusable(false);
		c247.setIconTextGap(0);
		c247.setInheritsPopupMenu(false);
		c247.setRequestFocusEnabled(false);
		c247.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c247);
		c247.setBounds(189, 147, 21, 21);

		c248.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c248.setFocusable(false);
		c248.setIconTextGap(0);
		c248.setInheritsPopupMenu(false);
		c248.setRequestFocusEnabled(false);
		c248.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c248);
		c248.setBounds(252, 147, 21, 21);

		c249.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c249.setFocusable(false);
		c249.setIconTextGap(0);
		c249.setInheritsPopupMenu(false);
		c249.setRequestFocusEnabled(false);
		c249.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c249);
		c249.setBounds(273, 147, 21, 21);

		c250.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c250.setFocusable(false);
		c250.setIconTextGap(0);
		c250.setInheritsPopupMenu(false);
		c250.setRequestFocusEnabled(false);
		c250.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c250);
		c250.setBounds(105, 147, 21, 21);

		c251.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c251.setFocusable(false);
		c251.setIconTextGap(0);
		c251.setInheritsPopupMenu(false);
		c251.setRequestFocusEnabled(false);
		c251.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c251);
		c251.setBounds(210, 147, 21, 21);

		c252.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c252.setFocusable(false);
		c252.setIconTextGap(0);
		c252.setInheritsPopupMenu(false);
		c252.setRequestFocusEnabled(false);
		c252.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c252);
		c252.setBounds(294, 168, 21, 21);

		c253.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c253.setFocusable(false);
		c253.setIconTextGap(0);
		c253.setInheritsPopupMenu(false);
		c253.setRequestFocusEnabled(false);
		c253.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c253);
		c253.setBounds(273, 168, 21, 21);

		c254.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c254.setFocusable(false);
		c254.setIconTextGap(0);
		c254.setInheritsPopupMenu(false);
		c254.setRequestFocusEnabled(false);
		c254.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c254);
		c254.setBounds(315, 168, 21, 21);

		c255.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c255.setFocusable(false);
		c255.setIconTextGap(0);
		c255.setInheritsPopupMenu(false);
		c255.setRequestFocusEnabled(false);
		c255.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c255);
		c255.setBounds(231, 168, 21, 21);

		c256.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c256.setFocusable(false);
		c256.setIconTextGap(0);
		c256.setInheritsPopupMenu(false);
		c256.setRequestFocusEnabled(false);
		c256.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c256);
		c256.setBounds(252, 168, 21, 21);

		c257.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c257.setFocusable(false);
		c257.setIconTextGap(0);
		c257.setInheritsPopupMenu(false);
		c257.setRequestFocusEnabled(false);
		c257.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c257);
		c257.setBounds(147, 168, 21, 21);

		c258.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c258.setFocusable(false);
		c258.setIconTextGap(0);
		c258.setInheritsPopupMenu(false);
		c258.setRequestFocusEnabled(false);
		c258.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c258);
		c258.setBounds(378, 168, 21, 21);

		c259.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c259.setFocusable(false);
		c259.setIconTextGap(0);
		c259.setInheritsPopupMenu(false);
		c259.setRequestFocusEnabled(false);
		c259.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c259);
		c259.setBounds(21, 168, 21, 21);

		c260.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c260.setFocusable(false);
		c260.setIconTextGap(0);
		c260.setInheritsPopupMenu(false);
		c260.setRequestFocusEnabled(false);
		c260.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c260);
		c260.setBounds(126, 168, 21, 21);

		c261.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c261.setFocusable(false);
		c261.setIconTextGap(0);
		c261.setInheritsPopupMenu(false);
		c261.setRequestFocusEnabled(false);
		c261.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c261);
		c261.setBounds(168, 168, 21, 21);

		c262.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c262.setFocusable(false);
		c262.setIconTextGap(0);
		c262.setInheritsPopupMenu(false);
		c262.setRequestFocusEnabled(false);
		c262.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c262);
		c262.setBounds(84, 168, 21, 21);

		c263.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c263.setFocusable(false);
		c263.setIconTextGap(0);
		c263.setInheritsPopupMenu(false);
		c263.setRequestFocusEnabled(false);
		c263.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c263);
		c263.setBounds(336, 168, 21, 21);

		c264.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c264.setFocusable(false);
		c264.setIconTextGap(0);
		c264.setInheritsPopupMenu(false);
		c264.setRequestFocusEnabled(false);
		c264.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c264);
		c264.setBounds(0, 168, 21, 21);

		c265.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c265.setFocusable(false);
		c265.setIconTextGap(0);
		c265.setInheritsPopupMenu(false);
		c265.setRequestFocusEnabled(false);
		c265.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c265);
		c265.setBounds(63, 168, 21, 21);

		c266.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c266.setFocusable(false);
		c266.setIconTextGap(0);
		c266.setInheritsPopupMenu(false);
		c266.setRequestFocusEnabled(false);
		c266.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c266);
		c266.setBounds(210, 168, 21, 21);

		c267.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c267.setFocusable(false);
		c267.setIconTextGap(0);
		c267.setInheritsPopupMenu(false);
		c267.setRequestFocusEnabled(false);
		c267.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c267);
		c267.setBounds(105, 168, 21, 21);

		c268.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c268.setFocusable(false);
		c268.setIconTextGap(0);
		c268.setInheritsPopupMenu(false);
		c268.setRequestFocusEnabled(false);
		c268.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c268);
		c268.setBounds(357, 168, 21, 21);

		c269.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c269.setFocusable(false);
		c269.setIconTextGap(0);
		c269.setInheritsPopupMenu(false);
		c269.setRequestFocusEnabled(false);
		c269.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c269);
		c269.setBounds(42, 168, 21, 21);

		c270.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c270.setFocusable(false);
		c270.setIconTextGap(0);
		c270.setInheritsPopupMenu(false);
		c270.setRequestFocusEnabled(false);
		c270.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c270);
		c270.setBounds(189, 168, 21, 21);

		c271.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c271.setFocusable(false);
		c271.setIconTextGap(0);
		c271.setInheritsPopupMenu(false);
		c271.setRequestFocusEnabled(false);
		c271.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c271);
		c271.setBounds(315, 189, 21, 21);

		c272.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c272.setFocusable(false);
		c272.setIconTextGap(0);
		c272.setInheritsPopupMenu(false);
		c272.setRequestFocusEnabled(false);
		c272.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c272);
		c272.setBounds(252, 189, 21, 21);

		c273.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c273.setFocusable(false);
		c273.setIconTextGap(0);
		c273.setInheritsPopupMenu(false);
		c273.setRequestFocusEnabled(false);
		c273.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c273);
		c273.setBounds(42, 189, 21, 21);

		c274.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c274.setFocusable(false);
		c274.setIconTextGap(0);
		c274.setInheritsPopupMenu(false);
		c274.setRequestFocusEnabled(false);
		c274.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c274);
		c274.setBounds(231, 189, 21, 21);

		c275.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c275.setFocusable(false);
		c275.setIconTextGap(0);
		c275.setInheritsPopupMenu(false);
		c275.setRequestFocusEnabled(false);
		c275.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c275);
		c275.setBounds(210, 189, 21, 21);

		c276.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c276.setFocusable(false);
		c276.setIconTextGap(0);
		c276.setInheritsPopupMenu(false);
		c276.setRequestFocusEnabled(false);
		c276.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c276);
		c276.setBounds(84, 189, 21, 21);

		c277.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c277.setFocusable(false);
		c277.setIconTextGap(0);
		c277.setInheritsPopupMenu(false);
		c277.setRequestFocusEnabled(false);
		c277.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c277);
		c277.setBounds(0, 189, 21, 21);

		c278.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c278.setFocusable(false);
		c278.setIconTextGap(0);
		c278.setInheritsPopupMenu(false);
		c278.setRequestFocusEnabled(false);
		c278.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c278);
		c278.setBounds(189, 189, 21, 21);

		c279.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c279.setFocusable(false);
		c279.setIconTextGap(0);
		c279.setInheritsPopupMenu(false);
		c279.setRequestFocusEnabled(false);
		c279.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c279);
		c279.setBounds(63, 189, 21, 21);

		c280.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c280.setFocusable(false);
		c280.setIconTextGap(0);
		c280.setInheritsPopupMenu(false);
		c280.setRequestFocusEnabled(false);
		c280.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c280);
		c280.setBounds(273, 189, 21, 21);

		c281.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c281.setFocusable(false);
		c281.setIconTextGap(0);
		c281.setInheritsPopupMenu(false);
		c281.setRequestFocusEnabled(false);
		c281.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c281);
		c281.setBounds(357, 189, 21, 21);

		c282.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c282.setFocusable(false);
		c282.setIconTextGap(0);
		c282.setInheritsPopupMenu(false);
		c282.setRequestFocusEnabled(false);
		c282.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c282);
		c282.setBounds(126, 189, 21, 21);

		c283.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c283.setFocusable(false);
		c283.setIconTextGap(0);
		c283.setInheritsPopupMenu(false);
		c283.setRequestFocusEnabled(false);
		c283.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c283);
		c283.setBounds(105, 189, 21, 21);

		c284.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c284.setFocusable(false);
		c284.setIconTextGap(0);
		c284.setInheritsPopupMenu(false);
		c284.setRequestFocusEnabled(false);
		c284.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c284);
		c284.setBounds(378, 189, 21, 21);

		c285.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c285.setFocusable(false);
		c285.setIconTextGap(0);
		c285.setInheritsPopupMenu(false);
		c285.setRequestFocusEnabled(false);
		c285.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c285);
		c285.setBounds(336, 189, 21, 21);

		c286.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c286.setFocusable(false);
		c286.setIconTextGap(0);
		c286.setInheritsPopupMenu(false);
		c286.setRequestFocusEnabled(false);
		c286.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c286);
		c286.setBounds(294, 189, 21, 21);

		c287.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c287.setFocusable(false);
		c287.setIconTextGap(0);
		c287.setInheritsPopupMenu(false);
		c287.setRequestFocusEnabled(false);
		c287.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c287);
		c287.setBounds(21, 189, 21, 21);

		c288.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c288.setFocusable(false);
		c288.setIconTextGap(0);
		c288.setInheritsPopupMenu(false);
		c288.setRequestFocusEnabled(false);
		c288.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c288);
		c288.setBounds(168, 189, 21, 21);

		c289.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c289.setFocusable(false);
		c289.setIconTextGap(0);
		c289.setInheritsPopupMenu(false);
		c289.setRequestFocusEnabled(false);
		c289.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c289);
		c289.setBounds(147, 189, 21, 21);

		c290.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c290.setFocusable(false);
		c290.setIconTextGap(0);
		c290.setInheritsPopupMenu(false);
		c290.setRequestFocusEnabled(false);
		c290.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c290);
		c290.setBounds(294, 210, 21, 21);

		c291.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c291.setFocusable(false);
		c291.setIconTextGap(0);
		c291.setInheritsPopupMenu(false);
		c291.setRequestFocusEnabled(false);
		c291.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c291);
		c291.setBounds(42, 210, 21, 21);

		c292.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c292.setFocusable(false);
		c292.setIconTextGap(0);
		c292.setInheritsPopupMenu(false);
		c292.setRequestFocusEnabled(false);
		c292.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c292);
		c292.setBounds(378, 210, 21, 21);

		c293.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c293.setFocusable(false);
		c293.setIconTextGap(0);
		c293.setInheritsPopupMenu(false);
		c293.setRequestFocusEnabled(false);
		c293.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c293);
		c293.setBounds(126, 210, 21, 21);

		c294.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c294.setFocusable(false);
		c294.setIconTextGap(0);
		c294.setInheritsPopupMenu(false);
		c294.setRequestFocusEnabled(false);
		c294.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c294);
		c294.setBounds(105, 210, 21, 21);

		c295.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c295.setFocusable(false);
		c295.setIconTextGap(0);
		c295.setInheritsPopupMenu(false);
		c295.setRequestFocusEnabled(false);
		c295.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c295);
		c295.setBounds(84, 210, 21, 21);

		c296.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c296.setFocusable(false);
		c296.setIconTextGap(0);
		c296.setInheritsPopupMenu(false);
		c296.setRequestFocusEnabled(false);
		c296.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c296);
		c296.setBounds(189, 210, 21, 21);

		c297.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c297.setFocusable(false);
		c297.setIconTextGap(0);
		c297.setInheritsPopupMenu(false);
		c297.setRequestFocusEnabled(false);
		c297.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c297);
		c297.setBounds(252, 210, 21, 21);

		c298.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c298.setFocusable(false);
		c298.setIconTextGap(0);
		c298.setInheritsPopupMenu(false);
		c298.setRequestFocusEnabled(false);
		c298.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c298);
		c298.setBounds(210, 210, 21, 21);

		c299.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c299.setFocusable(false);
		c299.setIconTextGap(0);
		c299.setInheritsPopupMenu(false);
		c299.setRequestFocusEnabled(false);
		c299.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c299);
		c299.setBounds(63, 210, 21, 21);

		c300.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c300.setFocusable(false);
		c300.setIconTextGap(0);
		c300.setInheritsPopupMenu(false);
		c300.setRequestFocusEnabled(false);
		c300.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c300);
		c300.setBounds(168, 210, 21, 21);

		c301.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c301.setFocusable(false);
		c301.setIconTextGap(0);
		c301.setInheritsPopupMenu(false);
		c301.setRequestFocusEnabled(false);
		c301.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c301);
		c301.setBounds(315, 210, 21, 21);

		c302.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c302.setFocusable(false);
		c302.setIconTextGap(0);
		c302.setInheritsPopupMenu(false);
		c302.setRequestFocusEnabled(false);
		c302.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c302);
		c302.setBounds(21, 210, 21, 21);

		c303.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c303.setFocusable(false);
		c303.setIconTextGap(0);
		c303.setInheritsPopupMenu(false);
		c303.setRequestFocusEnabled(false);
		c303.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c303);
		c303.setBounds(0, 210, 21, 21);

		c304.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c304.setFocusable(false);
		c304.setIconTextGap(0);
		c304.setInheritsPopupMenu(false);
		c304.setRequestFocusEnabled(false);
		c304.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c304);
		c304.setBounds(147, 210, 21, 21);

		c305.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c305.setFocusable(false);
		c305.setIconTextGap(0);
		c305.setInheritsPopupMenu(false);
		c305.setRequestFocusEnabled(false);
		c305.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c305);
		c305.setBounds(231, 210, 21, 21);

		c306.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c306.setFocusable(false);
		c306.setIconTextGap(0);
		c306.setInheritsPopupMenu(false);
		c306.setRequestFocusEnabled(false);
		c306.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c306);
		c306.setBounds(357, 210, 21, 21);

		c307.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c307.setFocusable(false);
		c307.setIconTextGap(0);
		c307.setInheritsPopupMenu(false);
		c307.setRequestFocusEnabled(false);
		c307.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c307);
		c307.setBounds(336, 210, 21, 21);

		c308.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c308.setFocusable(false);
		c308.setIconTextGap(0);
		c308.setInheritsPopupMenu(false);
		c308.setRequestFocusEnabled(false);
		c308.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c308);
		c308.setBounds(273, 210, 21, 21);

		c309.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c309.setFocusable(false);
		c309.setIconTextGap(0);
		c309.setInheritsPopupMenu(false);
		c309.setRequestFocusEnabled(false);
		c309.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c309);
		c309.setBounds(357, 231, 21, 21);

		c310.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c310.setFocusable(false);
		c310.setIconTextGap(0);
		c310.setInheritsPopupMenu(false);
		c310.setRequestFocusEnabled(false);
		c310.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c310);
		c310.setBounds(315, 231, 21, 21);

		c311.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c311.setFocusable(false);
		c311.setIconTextGap(0);
		c311.setInheritsPopupMenu(false);
		c311.setRequestFocusEnabled(false);
		c311.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c311);
		c311.setBounds(147, 231, 21, 21);

		c312.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c312.setFocusable(false);
		c312.setIconTextGap(0);
		c312.setInheritsPopupMenu(false);
		c312.setRequestFocusEnabled(false);
		c312.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c312);
		c312.setBounds(105, 231, 21, 21);

		c313.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c313.setFocusable(false);
		c313.setIconTextGap(0);
		c313.setInheritsPopupMenu(false);
		c313.setRequestFocusEnabled(false);
		c313.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c313);
		c313.setBounds(273, 231, 21, 21);

		c314.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c314.setFocusable(false);
		c314.setIconTextGap(0);
		c314.setInheritsPopupMenu(false);
		c314.setRequestFocusEnabled(false);
		c314.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c314);
		c314.setBounds(378, 231, 21, 21);

		c315.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c315.setFocusable(false);
		c315.setIconTextGap(0);
		c315.setInheritsPopupMenu(false);
		c315.setRequestFocusEnabled(false);
		c315.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c315);
		c315.setBounds(84, 231, 21, 21);

		c316.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c316.setFocusable(false);
		c316.setIconTextGap(0);
		c316.setInheritsPopupMenu(false);
		c316.setRequestFocusEnabled(false);
		c316.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c316);
		c316.setBounds(21, 231, 21, 21);

		c317.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c317.setFocusable(false);
		c317.setIconTextGap(0);
		c317.setInheritsPopupMenu(false);
		c317.setRequestFocusEnabled(false);
		c317.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c317);
		c317.setBounds(336, 231, 21, 21);

		c318.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c318.setFocusable(false);
		c318.setIconTextGap(0);
		c318.setInheritsPopupMenu(false);
		c318.setRequestFocusEnabled(false);
		c318.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c318);
		c318.setBounds(126, 231, 21, 21);

		c319.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c319.setFocusable(false);
		c319.setIconTextGap(0);
		c319.setInheritsPopupMenu(false);
		c319.setRequestFocusEnabled(false);
		c319.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c319);
		c319.setBounds(63, 231, 21, 21);

		c320.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c320.setFocusable(false);
		c320.setIconTextGap(0);
		c320.setInheritsPopupMenu(false);
		c320.setRequestFocusEnabled(false);
		c320.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c320);
		c320.setBounds(168, 231, 21, 21);

		c321.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c321.setFocusable(false);
		c321.setIconTextGap(0);
		c321.setInheritsPopupMenu(false);
		c321.setRequestFocusEnabled(false);
		c321.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c321);
		c321.setBounds(294, 231, 21, 21);

		c322.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c322.setFocusable(false);
		c322.setIconTextGap(0);
		c322.setInheritsPopupMenu(false);
		c322.setRequestFocusEnabled(false);
		c322.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c322);
		c322.setBounds(0, 231, 21, 21);

		c323.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c323.setFocusable(false);
		c323.setIconTextGap(0);
		c323.setInheritsPopupMenu(false);
		c323.setRequestFocusEnabled(false);
		c323.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c323);
		c323.setBounds(189, 231, 21, 21);

		c324.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c324.setFocusable(false);
		c324.setIconTextGap(0);
		c324.setInheritsPopupMenu(false);
		c324.setRequestFocusEnabled(false);
		c324.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c324);
		c324.setBounds(231, 231, 21, 21);

		c325.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c325.setFocusable(false);
		c325.setIconTextGap(0);
		c325.setInheritsPopupMenu(false);
		c325.setRequestFocusEnabled(false);
		c325.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c325);
		c325.setBounds(210, 231, 21, 21);

		c326.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c326.setFocusable(false);
		c326.setIconTextGap(0);
		c326.setInheritsPopupMenu(false);
		c326.setRequestFocusEnabled(false);
		c326.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c326);
		c326.setBounds(42, 231, 21, 21);

		c327.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c327.setFocusable(false);
		c327.setIconTextGap(0);
		c327.setInheritsPopupMenu(false);
		c327.setRequestFocusEnabled(false);
		c327.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c327);
		c327.setBounds(252, 231, 21, 21);

		c328.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c328.setFocusable(false);
		c328.setIconTextGap(0);
		c328.setInheritsPopupMenu(false);
		c328.setRequestFocusEnabled(false);
		c328.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c328);
		c328.setBounds(21, 252, 21, 21);

		c329.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c329.setFocusable(false);
		c329.setIconTextGap(0);
		c329.setInheritsPopupMenu(false);
		c329.setRequestFocusEnabled(false);
		c329.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c329);
		c329.setBounds(168, 252, 21, 21);

		c330.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c330.setFocusable(false);
		c330.setIconTextGap(0);
		c330.setInheritsPopupMenu(false);
		c330.setRequestFocusEnabled(false);
		c330.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c330);
		c330.setBounds(336, 252, 21, 21);

		c331.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c331.setFocusable(false);
		c331.setIconTextGap(0);
		c331.setInheritsPopupMenu(false);
		c331.setRequestFocusEnabled(false);
		c331.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c331);
		c331.setBounds(147, 252, 21, 21);

		c332.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c332.setFocusable(false);
		c332.setIconTextGap(0);
		c332.setInheritsPopupMenu(false);
		c332.setRequestFocusEnabled(false);
		c332.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c332);
		c332.setBounds(231, 252, 21, 21);

		c333.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c333.setFocusable(false);
		c333.setIconTextGap(0);
		c333.setInheritsPopupMenu(false);
		c333.setRequestFocusEnabled(false);
		c333.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c333);
		c333.setBounds(42, 252, 21, 21);

		c334.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c334.setFocusable(false);
		c334.setIconTextGap(0);
		c334.setInheritsPopupMenu(false);
		c334.setRequestFocusEnabled(false);
		c334.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c334);
		c334.setBounds(252, 252, 21, 21);

		c335.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c335.setFocusable(false);
		c335.setIconTextGap(0);
		c335.setInheritsPopupMenu(false);
		c335.setRequestFocusEnabled(false);
		c335.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c335);
		c335.setBounds(126, 252, 21, 21);

		c336.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c336.setFocusable(false);
		c336.setIconTextGap(0);
		c336.setInheritsPopupMenu(false);
		c336.setRequestFocusEnabled(false);
		c336.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c336);
		c336.setBounds(189, 252, 21, 21);

		c337.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c337.setFocusable(false);
		c337.setIconTextGap(0);
		c337.setInheritsPopupMenu(false);
		c337.setRequestFocusEnabled(false);
		c337.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c337);
		c337.setBounds(63, 252, 21, 21);

		c338.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c338.setFocusable(false);
		c338.setIconTextGap(0);
		c338.setInheritsPopupMenu(false);
		c338.setRequestFocusEnabled(false);
		c338.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c338);
		c338.setBounds(378, 252, 21, 21);

		c339.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c339.setFocusable(false);
		c339.setIconTextGap(0);
		c339.setInheritsPopupMenu(false);
		c339.setRequestFocusEnabled(false);
		c339.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c339);
		c339.setBounds(0, 252, 21, 21);

		c340.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c340.setFocusable(false);
		c340.setIconTextGap(0);
		c340.setInheritsPopupMenu(false);
		c340.setRequestFocusEnabled(false);
		c340.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c340);
		c340.setBounds(105, 252, 21, 21);

		c341.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c341.setFocusable(false);
		c341.setIconTextGap(0);
		c341.setInheritsPopupMenu(false);
		c341.setRequestFocusEnabled(false);
		c341.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c341);
		c341.setBounds(84, 252, 21, 21);

		c342.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c342.setFocusable(false);
		c342.setIconTextGap(0);
		c342.setInheritsPopupMenu(false);
		c342.setRequestFocusEnabled(false);
		c342.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c342);
		c342.setBounds(210, 252, 21, 21);

		c343.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c343.setFocusable(false);
		c343.setIconTextGap(0);
		c343.setInheritsPopupMenu(false);
		c343.setRequestFocusEnabled(false);
		c343.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c343);
		c343.setBounds(294, 252, 21, 21);

		c344.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c344.setFocusable(false);
		c344.setIconTextGap(0);
		c344.setInheritsPopupMenu(false);
		c344.setRequestFocusEnabled(false);
		c344.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c344);
		c344.setBounds(357, 252, 21, 21);

		c345.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c345.setFocusable(false);
		c345.setIconTextGap(0);
		c345.setInheritsPopupMenu(false);
		c345.setRequestFocusEnabled(false);
		c345.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c345);
		c345.setBounds(315, 252, 21, 21);

		c346.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c346.setFocusable(false);
		c346.setIconTextGap(0);
		c346.setInheritsPopupMenu(false);
		c346.setRequestFocusEnabled(false);
		c346.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c346);
		c346.setBounds(273, 252, 21, 21);

		c347.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c347.setFocusable(false);
		c347.setIconTextGap(0);
		c347.setInheritsPopupMenu(false);
		c347.setRequestFocusEnabled(false);
		c347.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c347);
		c347.setBounds(63, 273, 21, 21);

		c348.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c348.setFocusable(false);
		c348.setIconTextGap(0);
		c348.setInheritsPopupMenu(false);
		c348.setRequestFocusEnabled(false);
		c348.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c348);
		c348.setBounds(126, 273, 21, 21);

		c349.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c349.setFocusable(false);
		c349.setIconTextGap(0);
		c349.setInheritsPopupMenu(false);
		c349.setRequestFocusEnabled(false);
		c349.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c349);
		c349.setBounds(0, 273, 21, 21);

		c350.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c350.setFocusable(false);
		c350.setIconTextGap(0);
		c350.setInheritsPopupMenu(false);
		c350.setRequestFocusEnabled(false);
		c350.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c350);
		c350.setBounds(231, 273, 21, 21);

		c351.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c351.setFocusable(false);
		c351.setIconTextGap(0);
		c351.setInheritsPopupMenu(false);
		c351.setRequestFocusEnabled(false);
		c351.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c351);
		c351.setBounds(252, 273, 21, 21);

		c352.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c352.setFocusable(false);
		c352.setIconTextGap(0);
		c352.setInheritsPopupMenu(false);
		c352.setRequestFocusEnabled(false);
		c352.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c352);
		c352.setBounds(273, 273, 21, 21);

		c353.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c353.setFocusable(false);
		c353.setIconTextGap(0);
		c353.setInheritsPopupMenu(false);
		c353.setRequestFocusEnabled(false);
		c353.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c353);
		c353.setBounds(84, 273, 21, 21);

		c354.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c354.setFocusable(false);
		c354.setIconTextGap(0);
		c354.setInheritsPopupMenu(false);
		c354.setRequestFocusEnabled(false);
		c354.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c354);
		c354.setBounds(294, 273, 21, 21);

		c355.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c355.setFocusable(false);
		c355.setIconTextGap(0);
		c355.setInheritsPopupMenu(false);
		c355.setRequestFocusEnabled(false);
		c355.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c355);
		c355.setBounds(147, 273, 21, 21);

		c356.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c356.setFocusable(false);
		c356.setIconTextGap(0);
		c356.setInheritsPopupMenu(false);
		c356.setRequestFocusEnabled(false);
		c356.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c356);
		c356.setBounds(210, 273, 21, 21);

		c357.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c357.setFocusable(false);
		c357.setIconTextGap(0);
		c357.setInheritsPopupMenu(false);
		c357.setRequestFocusEnabled(false);
		c357.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c357);
		c357.setBounds(168, 273, 21, 21);

		c358.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c358.setFocusable(false);
		c358.setIconTextGap(0);
		c358.setInheritsPopupMenu(false);
		c358.setRequestFocusEnabled(false);
		c358.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c358);
		c358.setBounds(189, 273, 21, 21);

		c359.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c359.setFocusable(false);
		c359.setIconTextGap(0);
		c359.setInheritsPopupMenu(false);
		c359.setRequestFocusEnabled(false);
		c359.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c359);
		c359.setBounds(336, 273, 21, 21);

		c360.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c360.setFocusable(false);
		c360.setIconTextGap(0);
		c360.setInheritsPopupMenu(false);
		c360.setRequestFocusEnabled(false);
		c360.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c360);
		c360.setBounds(42, 273, 21, 21);

		c361.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c361.setFocusable(false);
		c361.setIconTextGap(0);
		c361.setInheritsPopupMenu(false);
		c361.setRequestFocusEnabled(false);
		c361.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c361);
		c361.setBounds(357, 273, 21, 21);

		c362.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c362.setFocusable(false);
		c362.setIconTextGap(0);
		c362.setInheritsPopupMenu(false);
		c362.setRequestFocusEnabled(false);
		c362.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c362);
		c362.setBounds(105, 273, 21, 21);

		c363.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c363.setFocusable(false);
		c363.setIconTextGap(0);
		c363.setInheritsPopupMenu(false);
		c363.setRequestFocusEnabled(false);
		c363.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c363);
		c363.setBounds(378, 273, 21, 21);

		c364.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c364.setFocusable(false);
		c364.setIconTextGap(0);
		c364.setInheritsPopupMenu(false);
		c364.setRequestFocusEnabled(false);
		c364.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c364);
		c364.setBounds(21, 273, 21, 21);

		c365.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c365.setFocusable(false);
		c365.setIconTextGap(0);
		c365.setInheritsPopupMenu(false);
		c365.setRequestFocusEnabled(false);
		c365.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c365);
		c365.setBounds(315, 273, 21, 21);

		c366.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c366.setFocusable(false);
		c366.setIconTextGap(0);
		c366.setInheritsPopupMenu(false);
		c366.setRequestFocusEnabled(false);
		c366.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c366);
		c366.setBounds(210, 294, 21, 21);

		c367.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c367.setFocusable(false);
		c367.setIconTextGap(0);
		c367.setInheritsPopupMenu(false);
		c367.setRequestFocusEnabled(false);
		c367.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c367);
		c367.setBounds(357, 294, 21, 21);

		c368.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c368.setFocusable(false);
		c368.setIconTextGap(0);
		c368.setInheritsPopupMenu(false);
		c368.setRequestFocusEnabled(false);
		c368.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c368);
		c368.setBounds(42, 294, 21, 21);

		c369.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c369.setFocusable(false);
		c369.setIconTextGap(0);
		c369.setInheritsPopupMenu(false);
		c369.setRequestFocusEnabled(false);
		c369.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c369);
		c369.setBounds(252, 294, 21, 21);

		c370.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c370.setFocusable(false);
		c370.setIconTextGap(0);
		c370.setInheritsPopupMenu(false);
		c370.setRequestFocusEnabled(false);
		c370.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c370);
		c370.setBounds(126, 294, 21, 21);

		c371.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c371.setFocusable(false);
		c371.setIconTextGap(0);
		c371.setInheritsPopupMenu(false);
		c371.setRequestFocusEnabled(false);
		c371.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c371);
		c371.setBounds(231, 294, 21, 21);

		c372.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c372.setFocusable(false);
		c372.setIconTextGap(0);
		c372.setInheritsPopupMenu(false);
		c372.setRequestFocusEnabled(false);
		c372.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c372);
		c372.setBounds(168, 294, 21, 21);

		c373.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c373.setFocusable(false);
		c373.setIconTextGap(0);
		c373.setInheritsPopupMenu(false);
		c373.setRequestFocusEnabled(false);
		c373.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c373);
		c373.setBounds(189, 294, 21, 21);

		c374.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c374.setFocusable(false);
		c374.setIconTextGap(0);
		c374.setInheritsPopupMenu(false);
		c374.setRequestFocusEnabled(false);
		c374.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c374);
		c374.setBounds(84, 294, 21, 21);

		c375.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c375.setFocusable(false);
		c375.setIconTextGap(0);
		c375.setInheritsPopupMenu(false);
		c375.setRequestFocusEnabled(false);
		c375.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c375);
		c375.setBounds(63, 294, 21, 21);

		c376.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c376.setFocusable(false);
		c376.setIconTextGap(0);
		c376.setInheritsPopupMenu(false);
		c376.setRequestFocusEnabled(false);
		c376.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c376);
		c376.setBounds(105, 294, 21, 21);

		c377.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c377.setFocusable(false);
		c377.setIconTextGap(0);
		c377.setInheritsPopupMenu(false);
		c377.setRequestFocusEnabled(false);
		c377.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c377);
		c377.setBounds(273, 294, 21, 21);

		c378.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c378.setFocusable(false);
		c378.setIconTextGap(0);
		c378.setInheritsPopupMenu(false);
		c378.setRequestFocusEnabled(false);
		c378.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c378);
		c378.setBounds(336, 294, 21, 21);

		c379.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c379.setFocusable(false);
		c379.setIconTextGap(0);
		c379.setInheritsPopupMenu(false);
		c379.setRequestFocusEnabled(false);
		c379.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c379);
		c379.setBounds(21, 294, 21, 21);

		c380.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c380.setFocusable(false);
		c380.setIconTextGap(0);
		c380.setInheritsPopupMenu(false);
		c380.setRequestFocusEnabled(false);
		c380.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c380);
		c380.setBounds(315, 294, 21, 21);

		c381.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c381.setFocusable(false);
		c381.setIconTextGap(0);
		c381.setInheritsPopupMenu(false);
		c381.setRequestFocusEnabled(false);
		c381.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c381);
		c381.setBounds(294, 294, 21, 21);

		c382.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c382.setFocusable(false);
		c382.setIconTextGap(0);
		c382.setInheritsPopupMenu(false);
		c382.setRequestFocusEnabled(false);
		c382.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c382);
		c382.setBounds(0, 294, 21, 21);

		c383.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c383.setFocusable(false);
		c383.setIconTextGap(0);
		c383.setInheritsPopupMenu(false);
		c383.setRequestFocusEnabled(false);
		c383.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c383);
		c383.setBounds(378, 294, 21, 21);

		c384.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c384.setFocusable(false);
		c384.setIconTextGap(0);
		c384.setInheritsPopupMenu(false);
		c384.setRequestFocusEnabled(false);
		c384.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c384);
		c384.setBounds(147, 294, 21, 21);

		c385.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c385.setFocusable(false);
		c385.setIconTextGap(0);
		c385.setInheritsPopupMenu(false);
		c385.setRequestFocusEnabled(false);
		c385.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c385);
		c385.setBounds(357, 315, 21, 21);

		c386.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c386.setFocusable(false);
		c386.setIconTextGap(0);
		c386.setInheritsPopupMenu(false);
		c386.setRequestFocusEnabled(false);
		c386.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c386);
		c386.setBounds(336, 315, 21, 21);

		c387.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c387.setFocusable(false);
		c387.setIconTextGap(0);
		c387.setInheritsPopupMenu(false);
		c387.setRequestFocusEnabled(false);
		c387.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c387);
		c387.setBounds(189, 315, 21, 21);

		c388.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c388.setFocusable(false);
		c388.setIconTextGap(0);
		c388.setInheritsPopupMenu(false);
		c388.setRequestFocusEnabled(false);
		c388.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c388);
		c388.setBounds(84, 315, 21, 21);

		c389.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c389.setFocusable(false);
		c389.setIconTextGap(0);
		c389.setInheritsPopupMenu(false);
		c389.setRequestFocusEnabled(false);
		c389.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c389);
		c389.setBounds(252, 315, 21, 21);

		c390.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c390.setFocusable(false);
		c390.setIconTextGap(0);
		c390.setInheritsPopupMenu(false);
		c390.setRequestFocusEnabled(false);
		c390.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c390);
		c390.setBounds(42, 315, 21, 21);

		c391.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c391.setFocusable(false);
		c391.setIconTextGap(0);
		c391.setInheritsPopupMenu(false);
		c391.setRequestFocusEnabled(false);
		c391.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c391);
		c391.setBounds(105, 315, 21, 21);

		c392.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c392.setFocusable(false);
		c392.setIconTextGap(0);
		c392.setInheritsPopupMenu(false);
		c392.setRequestFocusEnabled(false);
		c392.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c392);
		c392.setBounds(168, 315, 21, 21);

		c393.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c393.setFocusable(false);
		c393.setIconTextGap(0);
		c393.setInheritsPopupMenu(false);
		c393.setRequestFocusEnabled(false);
		c393.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c393);
		c393.setBounds(231, 315, 21, 21);

		c394.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c394.setFocusable(false);
		c394.setIconTextGap(0);
		c394.setInheritsPopupMenu(false);
		c394.setRequestFocusEnabled(false);
		c394.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c394);
		c394.setBounds(294, 315, 21, 21);

		c395.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c395.setFocusable(false);
		c395.setIconTextGap(0);
		c395.setInheritsPopupMenu(false);
		c395.setRequestFocusEnabled(false);
		c395.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c395);
		c395.setBounds(273, 315, 21, 21);

		c396.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c396.setFocusable(false);
		c396.setIconTextGap(0);
		c396.setInheritsPopupMenu(false);
		c396.setRequestFocusEnabled(false);
		c396.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c396);
		c396.setBounds(315, 315, 21, 21);

		c397.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c397.setFocusable(false);
		c397.setIconTextGap(0);
		c397.setInheritsPopupMenu(false);
		c397.setRequestFocusEnabled(false);
		c397.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c397);
		c397.setBounds(0, 315, 21, 21);

		c398.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c398.setFocusable(false);
		c398.setIconTextGap(0);
		c398.setInheritsPopupMenu(false);
		c398.setRequestFocusEnabled(false);
		c398.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c398);
		c398.setBounds(378, 315, 21, 21);

		c399.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c399.setFocusable(false);
		c399.setIconTextGap(0);
		c399.setInheritsPopupMenu(false);
		c399.setRequestFocusEnabled(false);
		c399.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c399);
		c399.setBounds(63, 315, 21, 21);

		c400.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c400.setFocusable(false);
		c400.setIconTextGap(0);
		c400.setInheritsPopupMenu(false);
		c400.setRequestFocusEnabled(false);
		c400.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c400);
		c400.setBounds(210, 315, 21, 21);

		c401.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c401.setFocusable(false);
		c401.setIconTextGap(0);
		c401.setInheritsPopupMenu(false);
		c401.setRequestFocusEnabled(false);
		c401.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c401);
		c401.setBounds(21, 315, 21, 21);

		c402.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c402.setFocusable(false);
		c402.setIconTextGap(0);
		c402.setInheritsPopupMenu(false);
		c402.setRequestFocusEnabled(false);
		c402.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c402);
		c402.setBounds(147, 315, 21, 21);

		c403.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c403.setFocusable(false);
		c403.setIconTextGap(0);
		c403.setInheritsPopupMenu(false);
		c403.setRequestFocusEnabled(false);
		c403.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c403);
		c403.setBounds(126, 315, 21, 21);

		c404.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c404.setFocusable(false);
		c404.setIconTextGap(0);
		c404.setInheritsPopupMenu(false);
		c404.setRequestFocusEnabled(false);
		c404.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c404);
		c404.setBounds(336, 336, 21, 21);

		c405.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c405.setFocusable(false);
		c405.setIconTextGap(0);
		c405.setInheritsPopupMenu(false);
		c405.setRequestFocusEnabled(false);
		c405.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c405);
		c405.setBounds(357, 336, 21, 21);

		c406.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c406.setFocusable(false);
		c406.setIconTextGap(0);
		c406.setInheritsPopupMenu(false);
		c406.setRequestFocusEnabled(false);
		c406.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c406);
		c406.setBounds(315, 336, 21, 21);

		c407.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c407.setFocusable(false);
		c407.setIconTextGap(0);
		c407.setInheritsPopupMenu(false);
		c407.setRequestFocusEnabled(false);
		c407.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c407);
		c407.setBounds(0, 336, 21, 21);

		c408.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c408.setFocusable(false);
		c408.setIconTextGap(0);
		c408.setInheritsPopupMenu(false);
		c408.setRequestFocusEnabled(false);
		c408.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c408);
		c408.setBounds(210, 336, 21, 21);

		c409.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c409.setFocusable(false);
		c409.setIconTextGap(0);
		c409.setInheritsPopupMenu(false);
		c409.setRequestFocusEnabled(false);
		c409.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c409);
		c409.setBounds(252, 336, 21, 21);

		c410.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c410.setFocusable(false);
		c410.setIconTextGap(0);
		c410.setInheritsPopupMenu(false);
		c410.setRequestFocusEnabled(false);
		c410.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c410);
		c410.setBounds(21, 336, 21, 21);

		c411.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c411.setFocusable(false);
		c411.setIconTextGap(0);
		c411.setInheritsPopupMenu(false);
		c411.setRequestFocusEnabled(false);
		c411.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c411);
		c411.setBounds(147, 336, 21, 21);

		c412.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c412.setFocusable(false);
		c412.setIconTextGap(0);
		c412.setInheritsPopupMenu(false);
		c412.setRequestFocusEnabled(false);
		c412.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c412);
		c412.setBounds(84, 336, 21, 21);

		c413.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c413.setFocusable(false);
		c413.setIconTextGap(0);
		c413.setInheritsPopupMenu(false);
		c413.setRequestFocusEnabled(false);
		c413.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c413);
		c413.setBounds(42, 336, 21, 21);

		c414.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c414.setFocusable(false);
		c414.setIconTextGap(0);
		c414.setInheritsPopupMenu(false);
		c414.setRequestFocusEnabled(false);
		c414.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c414);
		c414.setBounds(126, 336, 21, 21);

		c415.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c415.setFocusable(false);
		c415.setIconTextGap(0);
		c415.setInheritsPopupMenu(false);
		c415.setRequestFocusEnabled(false);
		c415.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c415);
		c415.setBounds(231, 336, 21, 21);

		c416.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c416.setFocusable(false);
		c416.setIconTextGap(0);
		c416.setInheritsPopupMenu(false);
		c416.setRequestFocusEnabled(false);
		c416.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c416);
		c416.setBounds(294, 336, 21, 21);

		c417.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c417.setFocusable(false);
		c417.setIconTextGap(0);
		c417.setInheritsPopupMenu(false);
		c417.setRequestFocusEnabled(false);
		c417.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c417);
		c417.setBounds(378, 336, 21, 21);

		c418.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c418.setFocusable(false);
		c418.setIconTextGap(0);
		c418.setInheritsPopupMenu(false);
		c418.setRequestFocusEnabled(false);
		c418.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c418);
		c418.setBounds(189, 336, 21, 21);

		c419.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c419.setFocusable(false);
		c419.setIconTextGap(0);
		c419.setInheritsPopupMenu(false);
		c419.setRequestFocusEnabled(false);
		c419.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c419);
		c419.setBounds(105, 336, 21, 21);

		c420.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c420.setFocusable(false);
		c420.setIconTextGap(0);
		c420.setInheritsPopupMenu(false);
		c420.setRequestFocusEnabled(false);
		c420.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c420);
		c420.setBounds(273, 336, 21, 21);

		c421.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c421.setFocusable(false);
		c421.setIconTextGap(0);
		c421.setInheritsPopupMenu(false);
		c421.setRequestFocusEnabled(false);
		c421.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c421);
		c421.setBounds(168, 336, 21, 21);

		c422.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c422.setFocusable(false);
		c422.setIconTextGap(0);
		c422.setInheritsPopupMenu(false);
		c422.setRequestFocusEnabled(false);
		c422.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c422);
		c422.setBounds(63, 336, 21, 21);

		c423.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c423.setFocusable(false);
		c423.setIconTextGap(0);
		c423.setInheritsPopupMenu(false);
		c423.setRequestFocusEnabled(false);
		c423.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c423);
		c423.setBounds(378, 357, 21, 21);

		c424.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c424.setFocusable(false);
		c424.setIconTextGap(0);
		c424.setInheritsPopupMenu(false);
		c424.setRequestFocusEnabled(false);
		c424.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c424);
		c424.setBounds(168, 357, 21, 21);

		c425.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c425.setFocusable(false);
		c425.setIconTextGap(0);
		c425.setInheritsPopupMenu(false);
		c425.setRequestFocusEnabled(false);
		c425.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c425);
		c425.setBounds(126, 357, 21, 21);

		c426.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c426.setFocusable(false);
		c426.setIconTextGap(0);
		c426.setInheritsPopupMenu(false);
		c426.setRequestFocusEnabled(false);
		c426.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c426);
		c426.setBounds(21, 357, 21, 21);

		c427.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c427.setFocusable(false);
		c427.setIconTextGap(0);
		c427.setInheritsPopupMenu(false);
		c427.setRequestFocusEnabled(false);
		c427.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c427);
		c427.setBounds(105, 357, 21, 21);

		c428.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c428.setFocusable(false);
		c428.setIconTextGap(0);
		c428.setInheritsPopupMenu(false);
		c428.setRequestFocusEnabled(false);
		c428.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c428);
		c428.setBounds(210, 357, 21, 21);

		c429.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c429.setFocusable(false);
		c429.setIconTextGap(0);
		c429.setInheritsPopupMenu(false);
		c429.setRequestFocusEnabled(false);
		c429.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c429);
		c429.setBounds(42, 357, 21, 21);

		c430.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c430.setFocusable(false);
		c430.setIconTextGap(0);
		c430.setInheritsPopupMenu(false);
		c430.setRequestFocusEnabled(false);
		c430.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c430);
		c430.setBounds(336, 357, 21, 21);

		c431.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c431.setFocusable(false);
		c431.setIconTextGap(0);
		c431.setInheritsPopupMenu(false);
		c431.setRequestFocusEnabled(false);
		c431.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c431);
		c431.setBounds(84, 357, 21, 21);

		c432.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c432.setFocusable(false);
		c432.setIconTextGap(0);
		c432.setInheritsPopupMenu(false);
		c432.setRequestFocusEnabled(false);
		c432.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c432);
		c432.setBounds(189, 357, 21, 21);

		c433.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c433.setFocusable(false);
		c433.setIconTextGap(0);
		c433.setInheritsPopupMenu(false);
		c433.setRequestFocusEnabled(false);
		c433.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c433);
		c433.setBounds(273, 357, 21, 21);

		c434.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c434.setFocusable(false);
		c434.setIconTextGap(0);
		c434.setInheritsPopupMenu(false);
		c434.setRequestFocusEnabled(false);
		c434.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c434);
		c434.setBounds(357, 357, 21, 21);

		c435.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c435.setFocusable(false);
		c435.setIconTextGap(0);
		c435.setInheritsPopupMenu(false);
		c435.setRequestFocusEnabled(false);
		c435.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c435);
		c435.setBounds(252, 357, 21, 21);

		c436.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c436.setFocusable(false);
		c436.setIconTextGap(0);
		c436.setInheritsPopupMenu(false);
		c436.setRequestFocusEnabled(false);
		c436.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c436);
		c436.setBounds(0, 357, 21, 21);

		c437.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c437.setFocusable(false);
		c437.setIconTextGap(0);
		c437.setInheritsPopupMenu(false);
		c437.setRequestFocusEnabled(false);
		c437.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c437);
		c437.setBounds(294, 357, 21, 21);

		c438.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c438.setFocusable(false);
		c438.setIconTextGap(0);
		c438.setInheritsPopupMenu(false);
		c438.setRequestFocusEnabled(false);
		c438.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c438);
		c438.setBounds(147, 357, 21, 21);

		c439.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c439.setFocusable(false);
		c439.setIconTextGap(0);
		c439.setInheritsPopupMenu(false);
		c439.setRequestFocusEnabled(false);
		c439.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c439);
		c439.setBounds(231, 357, 21, 21);

		c440.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c440.setFocusable(false);
		c440.setIconTextGap(0);
		c440.setInheritsPopupMenu(false);
		c440.setRequestFocusEnabled(false);
		c440.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c440);
		c440.setBounds(315, 357, 21, 21);

		c441.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c441.setFocusable(false);
		c441.setIconTextGap(0);
		c441.setInheritsPopupMenu(false);
		c441.setRequestFocusEnabled(false);
		c441.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c441);
		c441.setBounds(63, 357, 21, 21);

		c442.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c442.setFocusable(false);
		c442.setIconTextGap(0);
		c442.setInheritsPopupMenu(false);
		c442.setRequestFocusEnabled(false);
		c442.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c442);
		c442.setBounds(231, 378, 21, 21);

		c443.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c443.setFocusable(false);
		c443.setIconTextGap(0);
		c443.setInheritsPopupMenu(false);
		c443.setRequestFocusEnabled(false);
		c443.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c443);
		c443.setBounds(210, 378, 21, 21);

		c444.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c444.setFocusable(false);
		c444.setIconTextGap(0);
		c444.setInheritsPopupMenu(false);
		c444.setRequestFocusEnabled(false);
		c444.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c444);
		c444.setBounds(336, 378, 21, 21);

		c445.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c445.setFocusable(false);
		c445.setIconTextGap(0);
		c445.setInheritsPopupMenu(false);
		c445.setRequestFocusEnabled(false);
		c445.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c445);
		c445.setBounds(63, 378, 21, 21);

		c446.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c446.setFocusable(false);
		c446.setIconTextGap(0);
		c446.setInheritsPopupMenu(false);
		c446.setRequestFocusEnabled(false);
		c446.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c446);
		c446.setBounds(378, 378, 21, 21);

		c447.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c447.setFocusable(false);
		c447.setIconTextGap(0);
		c447.setInheritsPopupMenu(false);
		c447.setRequestFocusEnabled(false);
		c447.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c447);
		c447.setBounds(147, 378, 21, 21);

		c448.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c448.setFocusable(false);
		c448.setIconTextGap(0);
		c448.setInheritsPopupMenu(false);
		c448.setRequestFocusEnabled(false);
		c448.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c448);
		c448.setBounds(168, 378, 21, 21);

		c449.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c449.setFocusable(false);
		c449.setIconTextGap(0);
		c449.setInheritsPopupMenu(false);
		c449.setRequestFocusEnabled(false);
		c449.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c449);
		c449.setBounds(252, 378, 21, 21);

		c450.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c450.setFocusable(false);
		c450.setIconTextGap(0);
		c450.setInheritsPopupMenu(false);
		c450.setRequestFocusEnabled(false);
		c450.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c450);
		c450.setBounds(126, 378, 21, 21);

		c451.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c451.setFocusable(false);
		c451.setIconTextGap(0);
		c451.setInheritsPopupMenu(false);
		c451.setRequestFocusEnabled(false);
		c451.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c451);
		c451.setBounds(189, 378, 21, 21);

		c452.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c452.setFocusable(false);
		c452.setIconTextGap(0);
		c452.setInheritsPopupMenu(false);
		c452.setRequestFocusEnabled(false);
		c452.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c452);
		c452.setBounds(357, 378, 21, 21);

		c453.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c453.setFocusable(false);
		c453.setIconTextGap(0);
		c453.setInheritsPopupMenu(false);
		c453.setRequestFocusEnabled(false);
		c453.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c453);
		c453.setBounds(42, 378, 21, 21);

		c454.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c454.setFocusable(false);
		c454.setIconTextGap(0);
		c454.setInheritsPopupMenu(false);
		c454.setRequestFocusEnabled(false);
		c454.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c454);
		c454.setBounds(294, 378, 21, 21);

		c455.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c455.setFocusable(false);
		c455.setIconTextGap(0);
		c455.setInheritsPopupMenu(false);
		c455.setRequestFocusEnabled(false);
		c455.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c455);
		c455.setBounds(21, 378, 21, 21);

		c456.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c456.setFocusable(false);
		c456.setIconTextGap(0);
		c456.setInheritsPopupMenu(false);
		c456.setRequestFocusEnabled(false);
		c456.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c456);
		c456.setBounds(84, 378, 21, 21);

		c457.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c457.setFocusable(false);
		c457.setIconTextGap(0);
		c457.setInheritsPopupMenu(false);
		c457.setRequestFocusEnabled(false);
		c457.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c457);
		c457.setBounds(273, 378, 21, 21);

		c458.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c458.setFocusable(false);
		c458.setIconTextGap(0);
		c458.setInheritsPopupMenu(false);
		c458.setRequestFocusEnabled(false);
		c458.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c458);
		c458.setBounds(105, 378, 21, 21);

		c459.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c459.setFocusable(false);
		c459.setIconTextGap(0);
		c459.setInheritsPopupMenu(false);
		c459.setRequestFocusEnabled(false);
		c459.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c459);
		c459.setBounds(0, 378, 21, 21);

		c460.setIcon(new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"))); // NOI18N
		c460.setFocusable(false);
		c460.setIconTextGap(0);
		c460.setInheritsPopupMenu(false);
		c460.setRequestFocusEnabled(false);
		c460.setVerifyInputWhenFocusTarget(false);
		jPanel1.add(c460);
		c460.setBounds(315, 378, 21, 21);

// ---------------------------- añadir escuchadores de eventos en casillas ----------------

		c100.addMouseListener(formListener);
		c101.addMouseListener(formListener);
		c102.addMouseListener(formListener);
		c103.addMouseListener(formListener);
		c104.addMouseListener(formListener);
		c105.addMouseListener(formListener);
		c106.addMouseListener(formListener);
		c107.addMouseListener(formListener);
		c108.addMouseListener(formListener);
		c109.addMouseListener(formListener);
		c110.addMouseListener(formListener);
		c111.addMouseListener(formListener);
		c112.addMouseListener(formListener);
		c113.addMouseListener(formListener);
		c114.addMouseListener(formListener);
		c115.addMouseListener(formListener);
		c116.addMouseListener(formListener);
		c117.addMouseListener(formListener);
		c118.addMouseListener(formListener);
		c119.addMouseListener(formListener);
		c120.addMouseListener(formListener);
		c121.addMouseListener(formListener);
		c122.addMouseListener(formListener);
		c123.addMouseListener(formListener);
		c124.addMouseListener(formListener);
		c125.addMouseListener(formListener);
		c126.addMouseListener(formListener);
		c127.addMouseListener(formListener);
		c128.addMouseListener(formListener);
		c129.addMouseListener(formListener);
		c130.addMouseListener(formListener);
		c131.addMouseListener(formListener);
		c132.addMouseListener(formListener);
		c133.addMouseListener(formListener);
		c134.addMouseListener(formListener);
		c135.addMouseListener(formListener);
		c136.addMouseListener(formListener);
		c137.addMouseListener(formListener);
		c138.addMouseListener(formListener);
		c139.addMouseListener(formListener);
		c140.addMouseListener(formListener);
		c141.addMouseListener(formListener);
		c142.addMouseListener(formListener);
		c143.addMouseListener(formListener);
		c144.addMouseListener(formListener);
		c145.addMouseListener(formListener);
		c146.addMouseListener(formListener);
		c147.addMouseListener(formListener);
		c148.addMouseListener(formListener);
		c149.addMouseListener(formListener);
		c150.addMouseListener(formListener);
		c151.addMouseListener(formListener);
		c152.addMouseListener(formListener);
		c153.addMouseListener(formListener);
		c154.addMouseListener(formListener);
		c155.addMouseListener(formListener);
		c156.addMouseListener(formListener);
		c157.addMouseListener(formListener);
		c158.addMouseListener(formListener);
		c159.addMouseListener(formListener);
		c160.addMouseListener(formListener);
		c161.addMouseListener(formListener);
		c162.addMouseListener(formListener);
		c163.addMouseListener(formListener);
		c164.addMouseListener(formListener);
		c165.addMouseListener(formListener);
		c166.addMouseListener(formListener);
		c167.addMouseListener(formListener);
		c168.addMouseListener(formListener);
		c169.addMouseListener(formListener);
		c170.addMouseListener(formListener);
		c171.addMouseListener(formListener);
		c172.addMouseListener(formListener);
		c173.addMouseListener(formListener);
		c174.addMouseListener(formListener);
		c175.addMouseListener(formListener);
		c176.addMouseListener(formListener);
		c177.addMouseListener(formListener);
		c178.addMouseListener(formListener);
		c179.addMouseListener(formListener);
		c180.addMouseListener(formListener);
		c181.addMouseListener(formListener);
		c182.addMouseListener(formListener);
		c183.addMouseListener(formListener);
		c184.addMouseListener(formListener);
		c185.addMouseListener(formListener);
		c186.addMouseListener(formListener);
		c187.addMouseListener(formListener);
		c188.addMouseListener(formListener);
		c189.addMouseListener(formListener);
		c190.addMouseListener(formListener);
		c191.addMouseListener(formListener);
		c192.addMouseListener(formListener);
		c193.addMouseListener(formListener);
		c194.addMouseListener(formListener);
		c195.addMouseListener(formListener);
		c196.addMouseListener(formListener);
		c197.addMouseListener(formListener);
		c198.addMouseListener(formListener);
		c199.addMouseListener(formListener);
		c200.addMouseListener(formListener);
		c201.addMouseListener(formListener);
		c202.addMouseListener(formListener);
		c203.addMouseListener(formListener);
		c204.addMouseListener(formListener);
		c205.addMouseListener(formListener);
		c206.addMouseListener(formListener);
		c207.addMouseListener(formListener);
		c208.addMouseListener(formListener);
		c209.addMouseListener(formListener);
		c210.addMouseListener(formListener);
		c211.addMouseListener(formListener);
		c212.addMouseListener(formListener);
		c213.addMouseListener(formListener);
		c214.addMouseListener(formListener);
		c215.addMouseListener(formListener);
		c216.addMouseListener(formListener);
		c217.addMouseListener(formListener);
		c218.addMouseListener(formListener);
		c219.addMouseListener(formListener);
		c220.addMouseListener(formListener);
		c221.addMouseListener(formListener);
		c222.addMouseListener(formListener);
		c223.addMouseListener(formListener);
		c224.addMouseListener(formListener);
		c225.addMouseListener(formListener);
		c226.addMouseListener(formListener);
		c227.addMouseListener(formListener);
		c228.addMouseListener(formListener);
		c229.addMouseListener(formListener);
		c230.addMouseListener(formListener);
		c231.addMouseListener(formListener);
		c232.addMouseListener(formListener);
		c233.addMouseListener(formListener);
		c234.addMouseListener(formListener);
		c235.addMouseListener(formListener);
		c236.addMouseListener(formListener);
		c237.addMouseListener(formListener);
		c238.addMouseListener(formListener);
		c239.addMouseListener(formListener);
		c240.addMouseListener(formListener);
		c241.addMouseListener(formListener);
		c242.addMouseListener(formListener);
		c243.addMouseListener(formListener);
		c244.addMouseListener(formListener);
		c245.addMouseListener(formListener);
		c246.addMouseListener(formListener);
		c247.addMouseListener(formListener);
		c248.addMouseListener(formListener);
		c249.addMouseListener(formListener);
		c250.addMouseListener(formListener);
		c251.addMouseListener(formListener);
		c252.addMouseListener(formListener);
		c253.addMouseListener(formListener);
		c254.addMouseListener(formListener);
		c255.addMouseListener(formListener);
		c256.addMouseListener(formListener);
		c257.addMouseListener(formListener);
		c258.addMouseListener(formListener);
		c259.addMouseListener(formListener);
		c260.addMouseListener(formListener);
		c261.addMouseListener(formListener);
		c262.addMouseListener(formListener);
		c263.addMouseListener(formListener);
		c264.addMouseListener(formListener);
		c265.addMouseListener(formListener);
		c266.addMouseListener(formListener);
		c267.addMouseListener(formListener);
		c268.addMouseListener(formListener);
		c269.addMouseListener(formListener);
		c270.addMouseListener(formListener);
		c271.addMouseListener(formListener);
		c272.addMouseListener(formListener);
		c273.addMouseListener(formListener);
		c274.addMouseListener(formListener);
		c275.addMouseListener(formListener);
		c276.addMouseListener(formListener);
		c277.addMouseListener(formListener);
		c278.addMouseListener(formListener);
		c279.addMouseListener(formListener);
		c280.addMouseListener(formListener);
		c281.addMouseListener(formListener);
		c282.addMouseListener(formListener);
		c283.addMouseListener(formListener);
		c284.addMouseListener(formListener);
		c285.addMouseListener(formListener);
		c286.addMouseListener(formListener);
		c287.addMouseListener(formListener);
		c288.addMouseListener(formListener);
		c289.addMouseListener(formListener);
		c290.addMouseListener(formListener);
		c291.addMouseListener(formListener);
		c292.addMouseListener(formListener);
		c293.addMouseListener(formListener);
		c294.addMouseListener(formListener);
		c295.addMouseListener(formListener);
		c296.addMouseListener(formListener);
		c297.addMouseListener(formListener);
		c298.addMouseListener(formListener);
		c299.addMouseListener(formListener);
		c300.addMouseListener(formListener);
		c301.addMouseListener(formListener);
		c302.addMouseListener(formListener);
		c303.addMouseListener(formListener);
		c304.addMouseListener(formListener);
		c305.addMouseListener(formListener);
		c306.addMouseListener(formListener);
		c307.addMouseListener(formListener);
		c308.addMouseListener(formListener);
		c309.addMouseListener(formListener);
		c310.addMouseListener(formListener);
		c311.addMouseListener(formListener);
		c312.addMouseListener(formListener);
		c313.addMouseListener(formListener);
		c314.addMouseListener(formListener);
		c315.addMouseListener(formListener);
		c316.addMouseListener(formListener);
		c317.addMouseListener(formListener);
		c318.addMouseListener(formListener);
		c319.addMouseListener(formListener);
		c320.addMouseListener(formListener);
		c321.addMouseListener(formListener);
		c322.addMouseListener(formListener);
		c323.addMouseListener(formListener);
		c324.addMouseListener(formListener);
		c325.addMouseListener(formListener);
		c326.addMouseListener(formListener);
		c327.addMouseListener(formListener);
		c328.addMouseListener(formListener);
		c329.addMouseListener(formListener);
		c330.addMouseListener(formListener);
		c331.addMouseListener(formListener);
		c332.addMouseListener(formListener);
		c333.addMouseListener(formListener);
		c334.addMouseListener(formListener);
		c335.addMouseListener(formListener);
		c336.addMouseListener(formListener);
		c337.addMouseListener(formListener);
		c338.addMouseListener(formListener);
		c339.addMouseListener(formListener);
		c340.addMouseListener(formListener);
		c341.addMouseListener(formListener);
		c342.addMouseListener(formListener);
		c343.addMouseListener(formListener);
		c344.addMouseListener(formListener);
		c345.addMouseListener(formListener);
		c346.addMouseListener(formListener);
		c347.addMouseListener(formListener);
		c348.addMouseListener(formListener);
		c349.addMouseListener(formListener);
		c350.addMouseListener(formListener);
		c351.addMouseListener(formListener);
		c352.addMouseListener(formListener);
		c353.addMouseListener(formListener);
		c354.addMouseListener(formListener);
		c355.addMouseListener(formListener);
		c356.addMouseListener(formListener);
		c357.addMouseListener(formListener);
		c358.addMouseListener(formListener);
		c359.addMouseListener(formListener);
		c360.addMouseListener(formListener);
		c361.addMouseListener(formListener);
		c362.addMouseListener(formListener);
		c363.addMouseListener(formListener);
		c364.addMouseListener(formListener);
		c365.addMouseListener(formListener);
		c366.addMouseListener(formListener);
		c367.addMouseListener(formListener);
		c368.addMouseListener(formListener);
		c369.addMouseListener(formListener);
		c370.addMouseListener(formListener);
		c371.addMouseListener(formListener);
		c372.addMouseListener(formListener);
		c373.addMouseListener(formListener);
		c374.addMouseListener(formListener);
		c375.addMouseListener(formListener);
		c376.addMouseListener(formListener);
		c377.addMouseListener(formListener);
		c378.addMouseListener(formListener);
		c379.addMouseListener(formListener);
		c380.addMouseListener(formListener);
		c381.addMouseListener(formListener);
		c382.addMouseListener(formListener);
		c383.addMouseListener(formListener);
		c384.addMouseListener(formListener);
		c385.addMouseListener(formListener);
		c386.addMouseListener(formListener);
		c387.addMouseListener(formListener);
		c388.addMouseListener(formListener);
		c389.addMouseListener(formListener);
		c390.addMouseListener(formListener);
		c391.addMouseListener(formListener);
		c392.addMouseListener(formListener);
		c393.addMouseListener(formListener);
		c394.addMouseListener(formListener);
		c395.addMouseListener(formListener);
		c396.addMouseListener(formListener);
		c397.addMouseListener(formListener);
		c398.addMouseListener(formListener);
		c399.addMouseListener(formListener);
		c400.addMouseListener(formListener);
		c401.addMouseListener(formListener);
		c402.addMouseListener(formListener);
		c403.addMouseListener(formListener);
		c404.addMouseListener(formListener);
		c405.addMouseListener(formListener);
		c406.addMouseListener(formListener);
		c407.addMouseListener(formListener);
		c408.addMouseListener(formListener);
		c409.addMouseListener(formListener);
		c410.addMouseListener(formListener);
		c411.addMouseListener(formListener);
		c412.addMouseListener(formListener);
		c413.addMouseListener(formListener);
		c414.addMouseListener(formListener);
		c415.addMouseListener(formListener);
		c416.addMouseListener(formListener);
		c417.addMouseListener(formListener);
		c418.addMouseListener(formListener);
		c419.addMouseListener(formListener);
		c420.addMouseListener(formListener);
		c421.addMouseListener(formListener);
		c422.addMouseListener(formListener);
		c423.addMouseListener(formListener);
		c424.addMouseListener(formListener);
		c425.addMouseListener(formListener);
		c426.addMouseListener(formListener);
		c427.addMouseListener(formListener);
		c428.addMouseListener(formListener);
		c429.addMouseListener(formListener);
		c430.addMouseListener(formListener);
		c431.addMouseListener(formListener);
		c432.addMouseListener(formListener);
		c433.addMouseListener(formListener);
		c434.addMouseListener(formListener);
		c435.addMouseListener(formListener);
		c436.addMouseListener(formListener);
		c437.addMouseListener(formListener);
		c438.addMouseListener(formListener);
		c439.addMouseListener(formListener);
		c440.addMouseListener(formListener);
		c441.addMouseListener(formListener);
		c442.addMouseListener(formListener);
		c443.addMouseListener(formListener);
		c444.addMouseListener(formListener);
		c445.addMouseListener(formListener);
		c446.addMouseListener(formListener);
		c447.addMouseListener(formListener);
		c448.addMouseListener(formListener);
		c449.addMouseListener(formListener);
		c450.addMouseListener(formListener);
		c451.addMouseListener(formListener);
		c452.addMouseListener(formListener);
		c453.addMouseListener(formListener);
		c454.addMouseListener(formListener);
		c455.addMouseListener(formListener);
		c456.addMouseListener(formListener);
		c457.addMouseListener(formListener);
		c458.addMouseListener(formListener);
		c459.addMouseListener(formListener);
		c460.addMouseListener(formListener);

// ---------------------------- configurar botones ----------------------------------------

		botonA.setFocusPainted(false);
		botonA.setFocusable(false);
		botonA.setLabel("botonA");
		botonA.setRequestFocusEnabled(false);
		botonA.setRolloverEnabled(false);
		botonA.setVerifyInputWhenFocusTarget(false);
		botonA.addActionListener(formListener);

		jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(campoEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap())
		);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
								.addGap(0, 0, Short.MAX_VALUE)
								.addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
		);

		botonB.setText("botonB");
		botonB.setFocusPainted(false);
		botonB.setFocusable(false);
		botonB.setRequestFocusEnabled(false);
		botonB.setRolloverEnabled(false);
		botonB.setVerifyInputWhenFocusTarget(false);
		botonB.addActionListener(formListener);

		botonC.setText("botonC");
		botonC.setFocusPainted(false);
		botonC.setFocusable(false);
		botonC.setRequestFocusEnabled(false);
		botonC.setRolloverEnabled(false);
		botonC.setVerifyInputWhenFocusTarget(false);
		botonC.addActionListener(formListener);

		botonD.setText("botonD");
		botonD.setFocusPainted(false);
		botonD.setFocusable(false);
		botonD.setRequestFocusEnabled(false);
		botonD.setRolloverEnabled(false);
		botonD.setVerifyInputWhenFocusTarget(false);
		botonD.addActionListener(formListener);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGap(16, 16, 16)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(layout.createSequentialGroup()
												.addComponent(botonA, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(botonB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(botonC, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(botonD, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(16, 16, 16))
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGap(20, 20, 20)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(16, 16, 16)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(botonA)
										.addComponent(botonB)
										.addComponent(botonC)
										.addComponent(botonD))
								.addGap(16, 16, 16)
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(53, Short.MAX_VALUE))
		);

		getAccessibleContext().setAccessibleName("");

		setSize(new java.awt.Dimension(447, 564));
		setLocationRelativeTo(null);
	}

// ----------------------------- disparo de eventos de ratón --------------------------------------

	private class FormListener implements java.awt.event.ActionListener, java.awt.event.MouseListener {
		FormListener() {}
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			if (evt.getSource() == botonA) {
				Gomoku19.this.botonAActionPerformed(evt);
			}
			else if (evt.getSource() == botonB) {
				Gomoku19.this.botonBActionPerformed(evt);
			}
			else if (evt.getSource() == botonC) {
				Gomoku19.this.botonCActionPerformed(evt);
			}
			else if (evt.getSource() == botonD) {
				Gomoku19.this.botonDActionPerformed(evt);
			}
		}

		public void mouseClicked(java.awt.event.MouseEvent evt) {
			pulsandoRaton(evt);
			return;
		}

// ----------------------------------------------------------------------------------------------------------

		public void mouseEntered(java.awt.event.MouseEvent evt) {
			return;
		}

		public void mouseExited(java.awt.event.MouseEvent evt) {
			return;
		}

		public void mousePressed(java.awt.event.MouseEvent evt) {
			return;
		}

		public void mouseReleased(java.awt.event.MouseEvent evt) {
			return;
		}
	}

// ----------------------------------------------------------------------------------------------------------

	private void botonAActionPerformed(java.awt.event.ActionEvent evt) {
		pulsandoBoton(evt);
		return;
	}
	private void botonBActionPerformed(java.awt.event.ActionEvent evt) {
		pulsandoBoton(evt);
		return;
	}
	private void botonCActionPerformed(java.awt.event.ActionEvent evt) {
		pulsandoBoton(evt);
		return;
	}
	private void botonDActionPerformed(java.awt.event.ActionEvent evt) {
		pulsandoBoton(evt);
		return;
	}

// ------------------------------------ declaración de variables --------------------------------------------
	private javax.swing.JButton botonA, botonB, botonC, botonD;
	private javax.swing.JLabel campoEstado;
	private javax.swing.JPanel jPanel1, jPanel2;

	private javax.swing.JLabel
		c100,c101,c102,c103,c104,c105,c106,c107,c108,c109,c110,c111,c112,c113,c114,c115,c116,c117,c118,c119,
		c120,c121,c122,c123,c124,c125,c126,c127,c128,c129,c130,c131,c132,c133,c134,c135,c136,c137,c138,c139,
		c140,c141,c142,c143,c144,c145,c146,c147,c148,c149,c150,c151,c152,c153,c154,c155,c156,c157,c158,c159,
		c160,c161,c162,c163,c164,c165,c166,c167,c168,c169,c170,c171,c172,c173,c174,c175,c176,c177,c178,c179,
		c180,c181,c182,c183,c184,c185,c186,c187,c188,c189,c190,c191,c192,c193,c194,c195,c196,c197,c198,c199,
		c200,c201,c202,c203,c204,c205,c206,c207,c208,c209,c210,c211,c212,c213,c214,c215,c216,c217,c218,c219,
		c220,c221,c222,c223,c224,c225,c226,c227,c228,c229,c230,c231,c232,c233,c234,c235,c236,c237,c238,c239,
		c240,c241,c242,c243,c244,c245,c246,c247,c248,c249,c250,c251,c252,c253,c254,c255,c256,c257,c258,c259,
		c260,c261,c262,c263,c264,c265,c266,c267,c268,c269,c270,c271,c272,c273,c274,c275,c276,c277,c278,c279,
		c280,c281,c282,c283,c284,c285,c286,c287,c288,c289,c290,c291,c292,c293,c294,c295,c296,c297,c298,c299,
		c300,c301,c302,c303,c304,c305,c306,c307,c308,c309,c310,c311,c312,c313,c314,c315,c316,c317,c318,c319,
		c320,c321,c322,c323,c324,c325,c326,c327,c328,c329,c330,c331,c332,c333,c334,c335,c336,c337,c338,c339,
		c340,c341,c342,c343,c344,c345,c346,c347,c348,c349,c350,c351,c352,c353,c354,c355,c356,c357,c358,c359,
		c360,c361,c362,c363,c364,c365,c366,c367,c368,c369,c370,c371,c372,c373,c374,c375,c376,c377,c378,c379,
		c380,c381,c382,c383,c384,c385,c386,c387,c388,c389,c390,c391,c392,c393,c394,c395,c396,c397,c398,c399,
		c400,c401,c402,c403,c404,c405,c406,c407,c408,c409,c410,c411,c412,c413,c414,c415,c416,c417,c418,c419,
		c420,c421,c422,c423,c424,c425,c426,c427,c428,c429,c430,c431,c432,c433,c434,c435,c436,c437,c438,c439,
		c440,c441,c442,c443,c444,c445,c446,c447,c448,c449,c450,c451,c452,c453,c454,c455,c456,c457,c458,c459,
		c460;

// --------------------------- campos y métodos propios -----------------------------------------

	// campos propios
	Gomoku19 app; // referencia a la propia aplicación
	private final javax.swing.ImageIcon imagenVacia=new javax.swing.ImageIcon(getClass().getResource("vacio21borde.png"));
	private final javax.swing.ImageIcon imagenA=new javax.swing.ImageIcon(getClass().getResource("azul21borde.png"));
	private final javax.swing.ImageIcon imagenB=new javax.swing.ImageIcon(getClass().getResource("rojo21borde.png"));
	private boolean esTurnoA; // es o no el turno del jugador A
	private boolean esActivoGui; // es o no activa la interfaz de usuario
	private int[] casillas=new int[numCasillas];

	// métodos propios
	public void ejecutarControl() {
		setTitle("Gomoku-19    © 2024  Carlos Grasa Lambea"); // establece título de ventana
		setIconImage(new javax.swing.ImageIcon(getClass().getResource("logodesarrollador64.png")).getImage()); // establece icono de ventana
		botonA.setText("inicia A");
		botonA.setEnabled(true);
		botonB.setText("inicia B");
		botonB.setEnabled(true);
		botonC.setText("reiniciar");
		botonC.setEnabled(false);
		botonD.setText("ayuda");
		botonD.setEnabled(true);
		borrarCasillas();
		setEstado("Elija turno de juego para comenzar...");
		esActivoGui=false;
		return;
	}
	@Override
	public void pulsandoRaton(java.awt.event.MouseEvent evt) {
		if (!esActivoGui)
			return;
		javax.swing.JLabel cualCasilla=(javax.swing.JLabel) evt.getSource();
		if (getMarcaCasilla(cualCasilla)!=marcaVacia)
			return;
		esActivoGui=false;
		marcarCasilla(cualCasilla);
		pintarCasilla(cualCasilla);
		if (comprobarVictoria(getOrdinalCasilla(cualCasilla))) {
			setEstado("Gana la partida el jugador " + (esTurnoA ? "A (X)" : "B (O)"));
			botonC.setEnabled(true);
		} else {
			esTurnoA = !esTurnoA;
			setEstado("Es el turno del jugador " + (esTurnoA ? "A (X)" : "B (O)"));
			esActivoGui = true;
		}
		return;
	}
	@Override
	public void pulsandoBoton(java.awt.event.ActionEvent evt) {
		esActivoGui=false;
		if (evt.getActionCommand().equals("inicia A")) {
			esTurnoA = true;
			setEstado("Es el turno del jugador A");
			botonA.setEnabled(false);
			botonB.setEnabled(false);
		} else if (evt.getActionCommand().equals("inicia B")) {
			esTurnoA = false;
			setEstado("Es el turno del jugador B");
			botonA.setEnabled(false);
			botonB.setEnabled(false);
		} else if (evt.getActionCommand().equals("reiniciar")) {
			botonC.setEnabled(false);
			reiniciar();
		} else if (evt.getActionCommand().equals("ayuda")) {
			avisarModal(
				"En este juego, Gomoku, dos jugadores marcan casillas\n"
				+"con su propio símbolo por turnos.\n"
				+"Ganará la partida quien logre marcar cinco casillas\n"
				+"consecutivas en línea horizontal, vertical o diagonalmente.",
				"Acerca de Gomoku"
			);
		}
		esActivoGui=true;
		return;
	}
	@Override
	public void setEstado(String estado) {
		campoEstado.setText(estado);
		return;
	}
	@Override
	public void borrarCasillas() {
		for (int n=0; n<numCasillas; n++)
			casillas[n]=0;
		return;
	}
	@Override
	public void marcarCasilla(javax.swing.JLabel casilla) {
		casillas[getOrdinalCasilla(casilla)]=esTurnoA ? marcaA : marcaB;
		return;
	}
	@Override
	public void pintarCasilla(javax.swing.JLabel casilla) {
		casilla.setIcon(esTurnoA ? imagenA : imagenB);
		return;
	}
	@Override
	public int getMarcaCasilla(javax.swing.JLabel casilla) {
		return casillas[getOrdinalCasilla(casilla)];
	}
	@Override
	public boolean comprobarVictoria(int ordinal) { // comprobar si ese ordinal de casilla produce victoria
		int xDelta; // incremento direccional de columna (0: quieto, 1: derecha, -1: izquierda)
		int yDelta; // incremento direccional de fila (0: quieto, 1: abajo, -1: arriba)

		String quienJuega; // quién está jugando
		String tipoMarcas; // tipo de marcas del jugador en turno
		if (esTurnoA) {
			quienJuega="A";
			tipoMarcas="cruces azules";
		} else {
			quienJuega="B";
			tipoMarcas="círculos rojos";
		}

		// comprobación 5 en raya horizontal
		xDelta=1; // hacia derecha
		yDelta=0; // misma fila
		if (comprobar5enLinea(ordinal, xDelta, yDelta)) {
			avisarModal(
				"¡Enhorabuena, jugador "+quienJuega+"!\n"
					+"El jugador "+quienJuega+" gana la partida\ncolocando cinco "+tipoMarcas
					+"\nen línea horizontalmente.",
				"Fin de partida");
			return true;
		}
		// comprobación 5 en raya vertical
		xDelta=0; // misma columna
		yDelta=1; // hacia abajo
		if (comprobar5enLinea(ordinal, xDelta, yDelta)) {
			avisarModal(
				"¡Enhorabuena, jugador "+quienJuega+"!\n"
					+"El jugador "+quienJuega+" gana la partida\ncolocando cinco "+tipoMarcas
					+"\nen línea verticalmente.",
				"Fin de partida");
			return true;
		}
		// comprobación 5 en raya diagonal descendente
		xDelta=1; // misma columna
		yDelta=1; // hacia abajo
		if (comprobar5enLinea(ordinal, xDelta, yDelta)) {
			avisarModal(
					"¡Enhorabuena, jugador "+quienJuega+"!\n"
							+"El jugador "+quienJuega+" gana la partida\ncolocando cinco "+tipoMarcas
							+"\nen diagonal descendente.",
					"Fin de partida");
			return true;
		}
		// comprobación 5 en raya diagonal ascendente
		xDelta=1; // misma columna
		yDelta=-1; // hacia abajo
		if (comprobar5enLinea(ordinal, xDelta, yDelta)) {
			avisarModal(
					"¡Enhorabuena, jugador "+quienJuega+"!\n"
							+"El jugador "+quienJuega+" gana la partida\ncolocando cinco "+tipoMarcas
							+"\nen diagonal ascendente.",
					"Fin de partida");
			return true;
		}
		return false;
	}
	@Override
	public boolean comprobar5enLinea(int ordinal, int xDelta, int yDelta) {
		int marca=casillas[ordinal]; // marca a detectar
		int x=ordinalToColumna(ordinal)-4*xDelta; // posición inicial del explorador de columna
		int y=ordinalToFila(ordinal)-4*yDelta; // posición inicial del explorador de fila
		int numDianas=0; // contador de aciertos consecutivos

		for (int pasos=9; pasos>0 && numDianas<5; pasos--) {
			if (x>=0 && x<numColumnas && y>=0 && y<numFilas && casillas[filaColumnaToOrdinal(y, x)]==marca)
				numDianas++;
			else
				numDianas=0;
			x+=xDelta;
			y+=yDelta;
		}
		return numDianas>4;
	}
	@Override
	public void reiniciar() {
		limpiarTablero();
		ejecutarControl();
		return;
	}
	public void limpiarTablero() {
		c100.setIcon(imagenVacia);
		c101.setIcon(imagenVacia);
		c102.setIcon(imagenVacia);
		c103.setIcon(imagenVacia);
		c104.setIcon(imagenVacia);
		c105.setIcon(imagenVacia);
		c106.setIcon(imagenVacia);
		c107.setIcon(imagenVacia);
		c108.setIcon(imagenVacia);
		c109.setIcon(imagenVacia);
		c110.setIcon(imagenVacia);
		c111.setIcon(imagenVacia);
		c112.setIcon(imagenVacia);
		c113.setIcon(imagenVacia);
		c114.setIcon(imagenVacia);
		c115.setIcon(imagenVacia);
		c116.setIcon(imagenVacia);
		c117.setIcon(imagenVacia);
		c118.setIcon(imagenVacia);
		c119.setIcon(imagenVacia);
		c120.setIcon(imagenVacia);
		c121.setIcon(imagenVacia);
		c122.setIcon(imagenVacia);
		c123.setIcon(imagenVacia);
		c124.setIcon(imagenVacia);
		c125.setIcon(imagenVacia);
		c126.setIcon(imagenVacia);
		c127.setIcon(imagenVacia);
		c128.setIcon(imagenVacia);
		c129.setIcon(imagenVacia);
		c130.setIcon(imagenVacia);
		c131.setIcon(imagenVacia);
		c132.setIcon(imagenVacia);
		c133.setIcon(imagenVacia);
		c134.setIcon(imagenVacia);
		c135.setIcon(imagenVacia);
		c136.setIcon(imagenVacia);
		c137.setIcon(imagenVacia);
		c138.setIcon(imagenVacia);
		c139.setIcon(imagenVacia);
		c140.setIcon(imagenVacia);
		c141.setIcon(imagenVacia);
		c142.setIcon(imagenVacia);
		c143.setIcon(imagenVacia);
		c144.setIcon(imagenVacia);
		c145.setIcon(imagenVacia);
		c146.setIcon(imagenVacia);
		c147.setIcon(imagenVacia);
		c148.setIcon(imagenVacia);
		c149.setIcon(imagenVacia);
		c150.setIcon(imagenVacia);
		c151.setIcon(imagenVacia);
		c152.setIcon(imagenVacia);
		c153.setIcon(imagenVacia);
		c154.setIcon(imagenVacia);
		c155.setIcon(imagenVacia);
		c156.setIcon(imagenVacia);
		c157.setIcon(imagenVacia);
		c158.setIcon(imagenVacia);
		c159.setIcon(imagenVacia);
		c160.setIcon(imagenVacia);
		c161.setIcon(imagenVacia);
		c162.setIcon(imagenVacia);
		c163.setIcon(imagenVacia);
		c164.setIcon(imagenVacia);
		c165.setIcon(imagenVacia);
		c166.setIcon(imagenVacia);
		c167.setIcon(imagenVacia);
		c168.setIcon(imagenVacia);
		c169.setIcon(imagenVacia);
		c170.setIcon(imagenVacia);
		c171.setIcon(imagenVacia);
		c172.setIcon(imagenVacia);
		c173.setIcon(imagenVacia);
		c174.setIcon(imagenVacia);
		c175.setIcon(imagenVacia);
		c176.setIcon(imagenVacia);
		c177.setIcon(imagenVacia);
		c178.setIcon(imagenVacia);
		c179.setIcon(imagenVacia);
		c180.setIcon(imagenVacia);
		c181.setIcon(imagenVacia);
		c182.setIcon(imagenVacia);
		c183.setIcon(imagenVacia);
		c184.setIcon(imagenVacia);
		c185.setIcon(imagenVacia);
		c186.setIcon(imagenVacia);
		c187.setIcon(imagenVacia);
		c188.setIcon(imagenVacia);
		c189.setIcon(imagenVacia);
		c190.setIcon(imagenVacia);
		c191.setIcon(imagenVacia);
		c192.setIcon(imagenVacia);
		c193.setIcon(imagenVacia);
		c194.setIcon(imagenVacia);
		c195.setIcon(imagenVacia);
		c196.setIcon(imagenVacia);
		c197.setIcon(imagenVacia);
		c198.setIcon(imagenVacia);
		c199.setIcon(imagenVacia);
		c200.setIcon(imagenVacia);
		c201.setIcon(imagenVacia);
		c202.setIcon(imagenVacia);
		c203.setIcon(imagenVacia);
		c204.setIcon(imagenVacia);
		c205.setIcon(imagenVacia);
		c206.setIcon(imagenVacia);
		c207.setIcon(imagenVacia);
		c208.setIcon(imagenVacia);
		c209.setIcon(imagenVacia);
		c210.setIcon(imagenVacia);
		c211.setIcon(imagenVacia);
		c212.setIcon(imagenVacia);
		c213.setIcon(imagenVacia);
		c214.setIcon(imagenVacia);
		c215.setIcon(imagenVacia);
		c216.setIcon(imagenVacia);
		c217.setIcon(imagenVacia);
		c218.setIcon(imagenVacia);
		c219.setIcon(imagenVacia);
		c220.setIcon(imagenVacia);
		c221.setIcon(imagenVacia);
		c222.setIcon(imagenVacia);
		c223.setIcon(imagenVacia);
		c224.setIcon(imagenVacia);
		c225.setIcon(imagenVacia);
		c226.setIcon(imagenVacia);
		c227.setIcon(imagenVacia);
		c228.setIcon(imagenVacia);
		c229.setIcon(imagenVacia);
		c230.setIcon(imagenVacia);
		c231.setIcon(imagenVacia);
		c232.setIcon(imagenVacia);
		c233.setIcon(imagenVacia);
		c234.setIcon(imagenVacia);
		c235.setIcon(imagenVacia);
		c236.setIcon(imagenVacia);
		c237.setIcon(imagenVacia);
		c238.setIcon(imagenVacia);
		c239.setIcon(imagenVacia);
		c240.setIcon(imagenVacia);
		c241.setIcon(imagenVacia);
		c242.setIcon(imagenVacia);
		c243.setIcon(imagenVacia);
		c244.setIcon(imagenVacia);
		c245.setIcon(imagenVacia);
		c246.setIcon(imagenVacia);
		c247.setIcon(imagenVacia);
		c248.setIcon(imagenVacia);
		c249.setIcon(imagenVacia);
		c250.setIcon(imagenVacia);
		c251.setIcon(imagenVacia);
		c252.setIcon(imagenVacia);
		c253.setIcon(imagenVacia);
		c254.setIcon(imagenVacia);
		c255.setIcon(imagenVacia);
		c256.setIcon(imagenVacia);
		c257.setIcon(imagenVacia);
		c258.setIcon(imagenVacia);
		c259.setIcon(imagenVacia);
		c260.setIcon(imagenVacia);
		c261.setIcon(imagenVacia);
		c262.setIcon(imagenVacia);
		c263.setIcon(imagenVacia);
		c264.setIcon(imagenVacia);
		c265.setIcon(imagenVacia);
		c266.setIcon(imagenVacia);
		c267.setIcon(imagenVacia);
		c268.setIcon(imagenVacia);
		c269.setIcon(imagenVacia);
		c270.setIcon(imagenVacia);
		c271.setIcon(imagenVacia);
		c272.setIcon(imagenVacia);
		c273.setIcon(imagenVacia);
		c274.setIcon(imagenVacia);
		c275.setIcon(imagenVacia);
		c276.setIcon(imagenVacia);
		c277.setIcon(imagenVacia);
		c278.setIcon(imagenVacia);
		c279.setIcon(imagenVacia);
		c280.setIcon(imagenVacia);
		c281.setIcon(imagenVacia);
		c282.setIcon(imagenVacia);
		c283.setIcon(imagenVacia);
		c284.setIcon(imagenVacia);
		c285.setIcon(imagenVacia);
		c286.setIcon(imagenVacia);
		c287.setIcon(imagenVacia);
		c288.setIcon(imagenVacia);
		c289.setIcon(imagenVacia);
		c290.setIcon(imagenVacia);
		c291.setIcon(imagenVacia);
		c292.setIcon(imagenVacia);
		c293.setIcon(imagenVacia);
		c294.setIcon(imagenVacia);
		c295.setIcon(imagenVacia);
		c296.setIcon(imagenVacia);
		c297.setIcon(imagenVacia);
		c298.setIcon(imagenVacia);
		c299.setIcon(imagenVacia);
		c300.setIcon(imagenVacia);
		c301.setIcon(imagenVacia);
		c302.setIcon(imagenVacia);
		c303.setIcon(imagenVacia);
		c304.setIcon(imagenVacia);
		c305.setIcon(imagenVacia);
		c306.setIcon(imagenVacia);
		c307.setIcon(imagenVacia);
		c308.setIcon(imagenVacia);
		c309.setIcon(imagenVacia);
		c310.setIcon(imagenVacia);
		c311.setIcon(imagenVacia);
		c312.setIcon(imagenVacia);
		c313.setIcon(imagenVacia);
		c314.setIcon(imagenVacia);
		c315.setIcon(imagenVacia);
		c316.setIcon(imagenVacia);
		c317.setIcon(imagenVacia);
		c318.setIcon(imagenVacia);
		c319.setIcon(imagenVacia);
		c320.setIcon(imagenVacia);
		c321.setIcon(imagenVacia);
		c322.setIcon(imagenVacia);
		c323.setIcon(imagenVacia);
		c324.setIcon(imagenVacia);
		c325.setIcon(imagenVacia);
		c326.setIcon(imagenVacia);
		c327.setIcon(imagenVacia);
		c328.setIcon(imagenVacia);
		c329.setIcon(imagenVacia);
		c330.setIcon(imagenVacia);
		c331.setIcon(imagenVacia);
		c332.setIcon(imagenVacia);
		c333.setIcon(imagenVacia);
		c334.setIcon(imagenVacia);
		c335.setIcon(imagenVacia);
		c336.setIcon(imagenVacia);
		c337.setIcon(imagenVacia);
		c338.setIcon(imagenVacia);
		c339.setIcon(imagenVacia);
		c340.setIcon(imagenVacia);
		c341.setIcon(imagenVacia);
		c342.setIcon(imagenVacia);
		c343.setIcon(imagenVacia);
		c344.setIcon(imagenVacia);
		c345.setIcon(imagenVacia);
		c346.setIcon(imagenVacia);
		c347.setIcon(imagenVacia);
		c348.setIcon(imagenVacia);
		c349.setIcon(imagenVacia);
		c350.setIcon(imagenVacia);
		c351.setIcon(imagenVacia);
		c352.setIcon(imagenVacia);
		c353.setIcon(imagenVacia);
		c354.setIcon(imagenVacia);
		c355.setIcon(imagenVacia);
		c356.setIcon(imagenVacia);
		c357.setIcon(imagenVacia);
		c358.setIcon(imagenVacia);
		c359.setIcon(imagenVacia);
		c360.setIcon(imagenVacia);
		c361.setIcon(imagenVacia);
		c362.setIcon(imagenVacia);
		c363.setIcon(imagenVacia);
		c364.setIcon(imagenVacia);
		c365.setIcon(imagenVacia);
		c366.setIcon(imagenVacia);
		c367.setIcon(imagenVacia);
		c368.setIcon(imagenVacia);
		c369.setIcon(imagenVacia);
		c370.setIcon(imagenVacia);
		c371.setIcon(imagenVacia);
		c372.setIcon(imagenVacia);
		c373.setIcon(imagenVacia);
		c374.setIcon(imagenVacia);
		c375.setIcon(imagenVacia);
		c376.setIcon(imagenVacia);
		c377.setIcon(imagenVacia);
		c378.setIcon(imagenVacia);
		c379.setIcon(imagenVacia);
		c380.setIcon(imagenVacia);
		c381.setIcon(imagenVacia);
		c382.setIcon(imagenVacia);
		c383.setIcon(imagenVacia);
		c384.setIcon(imagenVacia);
		c385.setIcon(imagenVacia);
		c386.setIcon(imagenVacia);
		c387.setIcon(imagenVacia);
		c388.setIcon(imagenVacia);
		c389.setIcon(imagenVacia);
		c390.setIcon(imagenVacia);
		c391.setIcon(imagenVacia);
		c392.setIcon(imagenVacia);
		c393.setIcon(imagenVacia);
		c394.setIcon(imagenVacia);
		c395.setIcon(imagenVacia);
		c396.setIcon(imagenVacia);
		c397.setIcon(imagenVacia);
		c398.setIcon(imagenVacia);
		c399.setIcon(imagenVacia);
		c400.setIcon(imagenVacia);
		c401.setIcon(imagenVacia);
		c402.setIcon(imagenVacia);
		c403.setIcon(imagenVacia);
		c404.setIcon(imagenVacia);
		c405.setIcon(imagenVacia);
		c406.setIcon(imagenVacia);
		c407.setIcon(imagenVacia);
		c408.setIcon(imagenVacia);
		c409.setIcon(imagenVacia);
		c410.setIcon(imagenVacia);
		c411.setIcon(imagenVacia);
		c412.setIcon(imagenVacia);
		c413.setIcon(imagenVacia);
		c414.setIcon(imagenVacia);
		c415.setIcon(imagenVacia);
		c416.setIcon(imagenVacia);
		c417.setIcon(imagenVacia);
		c418.setIcon(imagenVacia);
		c419.setIcon(imagenVacia);
		c420.setIcon(imagenVacia);
		c421.setIcon(imagenVacia);
		c422.setIcon(imagenVacia);
		c423.setIcon(imagenVacia);
		c424.setIcon(imagenVacia);
		c425.setIcon(imagenVacia);
		c426.setIcon(imagenVacia);
		c427.setIcon(imagenVacia);
		c428.setIcon(imagenVacia);
		c429.setIcon(imagenVacia);
		c430.setIcon(imagenVacia);
		c431.setIcon(imagenVacia);
		c432.setIcon(imagenVacia);
		c433.setIcon(imagenVacia);
		c434.setIcon(imagenVacia);
		c435.setIcon(imagenVacia);
		c436.setIcon(imagenVacia);
		c437.setIcon(imagenVacia);
		c438.setIcon(imagenVacia);
		c439.setIcon(imagenVacia);
		c440.setIcon(imagenVacia);
		c441.setIcon(imagenVacia);
		c442.setIcon(imagenVacia);
		c443.setIcon(imagenVacia);
		c444.setIcon(imagenVacia);
		c445.setIcon(imagenVacia);
		c446.setIcon(imagenVacia);
		c447.setIcon(imagenVacia);
		c448.setIcon(imagenVacia);
		c449.setIcon(imagenVacia);
		c450.setIcon(imagenVacia);
		c451.setIcon(imagenVacia);
		c452.setIcon(imagenVacia);
		c453.setIcon(imagenVacia);
		c454.setIcon(imagenVacia);
		c455.setIcon(imagenVacia);
		c456.setIcon(imagenVacia);
		c457.setIcon(imagenVacia);
		c458.setIcon(imagenVacia);
		c459.setIcon(imagenVacia);
		c460.setIcon(imagenVacia);
		return;
	}
}
