-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 09-Ago-2019 às 17:09
-- Versão do servidor: 10.1.37-MariaDB
-- versão do PHP: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bdprojetoinfantil`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbatividades`
--

CREATE TABLE `tbatividades` (
  `idatividades` int(11) NOT NULL,
  `descricaoatividades` text COLLATE latin1_general_ci,
  `faixaatividades` varchar(5) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Extraindo dados da tabela `tbatividades`
--

INSERT INTO `tbatividades` (`idatividades`, `descricaoatividades`, `faixaatividades`) VALUES
(1, 'Pegue-o no colo, coloque-o de frente para que ele o olhe. Fale com ele suavemente para que preste atenção em você.', '0-3'),
(2, 'É importante estar atento às respostas dos estí­mulos propostos. Quando o bebê fixar os olhos no brinquedo mova-o lentamente, de um lado para o outro. Se o movimento for acompanhado pela criança, mova também para cima e para baixo. Aproveite este momento para aproximar e distanciar seu rosto do rosto de seu filho. Isto pode ser feito inclusive com a criança deitada de bruços, contribuindo assim para que ela levante a cabeça e o tronco. Colocar a criança de bruços, favorece o fortalecimento dos músculos do pescoço ao sustentar, gradativamente a cabeça.', '0-3'),
(3, 'Para que seu filho sinta-se bem, você pode realizar massagens, pois proporcionam relaxamento e bem-estar, eliminam tensões, aliviando cólicas e reduzindo a insônia, o que favorece o contato com a criança e o vínculo afetivo mãe-pai-bebê. A criança sente-se amada e segura através dos movimentos harmônicos realizados pelos pais durante a massagem. O local escolhido para sua realização deve ser tranquilo e aquecido. Com essa prática frequente a criança toma consciência do corpo mais cedo, em virtude do estímulo sensório-motor que favorece positivamente o desenvolvimento físico e emocional.', '0-3'),
(4, 'Fale perto dele de diferentes lugares para que ele procure de onde vem o som.', '0-3'),
(5, 'Converse com ele, mesmo quando você estiver em outras peças da casa. Ele poderá não entender tudo que você diz, mas vai ouvir e se sentir bem por não estar sozinho.', '0-3'),
(6, 'Repita os sons que ele faz (“eee”, “ooo”). Caso ele não emita nenhum som, faça você. Mesmo que ele não imite o que você faz neste momento, logo estará imitando.', '0-3'),
(7, 'Coloque em frente ao bebê um brinquedo leve para que ele o pegue. Caso não o faça no início, coloque o brinquedo em sua mão para que aprenda a agarrar.', '2-3'),
(8, 'Chame-o pelo nome com um tom de voz alegre e sorria para que ele olhe para você. Isto estimula o bebê para que mova-se e emita sons. Às vezes o bebê ficará quieto e olhará fixamente para você. Esta também é uma resposta ao estímulo que você está lhe dando.', '2-3'),
(9, 'A música pode auxiliar no desenvolvimento de seu filho, pois chama sua atenção e estimula a linguagem. Então, se possível cante para o bebê canções de ninar quando estiver aconchegado em seu colo. Assim transmitirá a ele uma sensação de tranquilidade, paz e alegria. Cante em diferentes momentos: na hora do banho ou em qualquer momento em que o bebê estiver perto de você.', '2-3'),
(10, 'Aproxime-se do bebê. Fale e quando ele olhar para você, cubra o seu rosto escondendo-se atrás de uma fralda ou pano. Em seguida retire a fralda e verá que ele procurará por você.', '3-6'),
(11, 'Você também pode brincar deixando cair um objeto perto do bebê e perguntar a ele onde está o brinquedo. Após, ponha o brinquedo ao alcance de suas mãos e quando ele for agarrá-lo, coloque a fralda ou pano por cima deixando uma parte de fora. Diga a ele que procure pelo brinquedo. Se o bebê não retirar a fralda de cima, tire você. Repita a brincadeira va?rias vezes.', '3-6'),
(12, 'O som dos objetos atrai a atenção do bebê. Mova um chocalho na frente dele e depois faça com que ele mesmo o agarre e agite.', '3-6'),
(13, 'Através de brincadeiras utilize brinquedos e objetos sonoros lateralmente. O uso desse material permite que sejam também estimuladas as onomatopeias (“au-au”, “miau-miau”, “piu-piu”).', '3-6'),
(14, 'Coloque um brinquedo leve perto do bebê para que o segure. Se conseguir, distancie um pouco mais o brinquedo, pois ao final da faixa etária já se inicia o processo do engatinhar.', '3-6'),
(15, 'Se você quer que o bebê aprenda a mudar de posição, coloque a seu lado um brinquedo e o estimule para que pegue. No princípio, pode ser que precise de sua ajuda, mas rapidamente conseguirá fazer sem auxílio.', '3-6'),
(16, 'Erga um brinquedo numa altura próxima do bebê e peça que ele o alcance. Distancie e aproxime o brinquedo. Este jogo, além de favorecer seus movimentos, também irá diverti-lo.', '3-6'),
(17, 'Invente sons musicais com objetos disponíveis em casa, como: tampas de panelas, garrafas plásticas com pedrinhas dentro, chocalhos com tampinhas de garrafas e diferentes tamanhos de caixa de papelão, que poderão imitar o som de um tambor. Atenção! Cuide para que os materiais estejam bem vedados para que não haja risco durante o seu manuseio.', '3-6'),
(18, 'Próximo aos seis meses, estimule seu bebê a sentar-se sozinho. Sente-o em lugar seguro apoiando-o entre almofadas, travesseiros, rolinhos ou cobertor. Coloque perto do bebê brinquedos e objetos de diferentes tamanhos, cores e formas, estimulando o bebê para que os pegue. Aos poucos vá retirando o apoio para que ele se esforce mantendo-se equilibrado até conseguir ficar sentado sem a necessidade de apoio.', '3-6'),
(19, 'Cante músicas alegres, com ritmos variados, batendo palmas, sacudindo as mãos e a cabeça. O bebê prestará atenção nos gestos e movimentos que voce? fizer e tentara? imitar.\r\n', '3-6'),
(20, 'Os brinquedos oferecidos devem ser de formas diferentes e não ultrapassando o tamanho da mão da criança que irá utilizá-lo. Podem ser colocados e retirados de bacias, panelas ou caixas. Primeiro você coloca um e estimula a criança fazer o mesmo. No princípio, você verá que seus movimentos ainda não esto bem definidos para sua idade; são inseguros. Mas aos poucos irão se tornando cada vez melhores.', '6-9'),
(21, 'Convide o bebê a bater um objeto no outro. Utilize brinquedos de madeira, plástico, borracha ou papelão.\r\n', '6-9'),
(22, 'Ao alimentá-lo, mais para o final desse período, ofereça pedacinhos de alimentos macios para que os pegue com suas próprias mãos, utilizando os 2 dedos. Ofereça também pequenos objetos ou brinquedos para que repita o mesmo movimento, mas cuide para que ele não os coloque na boca. Esses estímulos favorecerão o movimento da ponta dos dedos.', '6-9'),
(23, 'Brinque de esconder objetos com seu filho. Cubra os objetos com uma fralda ou pano e pergunte a ele onde está. Caso não encontre, retire para que ele pegue o objeto. Próximo aos 9 meses, você pode esconder em outros lugares. É possível que o bebê procure no mesmo lugar. Não importa, está se divertindo e aprendendo.', '6-9'),
(24, 'Comece a ensinar outros movimentos a seu filho, como brincadeiras e gestos, o “Parabéns a você” batendo palmas ou dar “tchau”. Ao conseguir imitar ele achará graça.', '6-9'),
(25, 'Repita os sons que ele fizer e espere que ele responda. Quando ele responder, sorria para que ele sorria também e continue na brincadeira. No dia-a-dia, chame seu filho pelo nome, bem como os demais membros da família para que aprenda a identificá-los.\r\n', '6-9'),
(26, 'Ao final da faixa etária o bebê já pode estar falando palavras simples, como “mama”, “papa”. Se ainda não estiver fazendo, logo o fará.', '6-9'),
(27, 'Coloque o bebê no chão e mostre a ele brinquedos que chamem sua atenção para que os alcance. Depois, mude o brinquedo de lugar para que engatinhe em diferentes direções. Sente você também no chão e peça para o que o bebê passe por cima de suas pernas. Você pode estimular o bebê a engatinhar. Ajude-o apoiando as palmas das suas mãos na planta dos pés do bebê para que ele obtenha o impulso necessário no processo de engatinhar.\r\n', '6-9'),
(28, 'Quando estiver sentado, coloque seu filho no chão perto de uma cadeira, sofá ou mesa. Ponha um brinquedo sobre o móvel e o estimule para que se levante e pegue. Ajude, se necessário. Caso esteja em pé, coloque o brinquedo no chão e peça a mesma coisa.\r\n', '6-9'),
(29, 'Amarre um brinquedo com um cordão e puxe. Assim você estará estimulando-o para que engatinhe em direção ao brinquedo. Lembre que as brincadeiras com cordas, fios ou cordões devem sempre acontecer na presença de um adulto!', '6-9'),
(30, 'Dê ordens simples como: “me dá a mão”, “vem aqui”, “traz o brinquedo” e faça perguntas como: “Onde está o papai?”, “Onde está o cachorro?”.\r\n', '9-12'),
(31, 'Estimule seu filho a manter um diálogo. Quando ele estiver falando fique em silêncio prestando atenção ao que ele diz e demonstrando interesse. Só depois que ele terminar, responda com alegria e carinho, mesmo que, muitas vezes, não entenda o que ele disse.\r\n', '9-12'),
(32, 'Quando você repetir os sons que ele produz, comece a combinar com palavras como: “mamãe”, “papai”, “vovó”. Dessa forma, pouco a pouco ele irá repetir as palavras.\r\n', '9-12'),
(33, 'Estimule seu filho a manter um diálogo. Quando ele estiver falando fique em silêncio prestando atenção ao que ele diz e demonstrando interesse. Só depois que ele terminar, responda com alegria e carinho, mesmo que, muitas vezes, não entenda o que ele disse.\r\n', '9-12'),
(34, 'Cante músicas com diferentes ritmos incentivando a criança a dançar, movimentar o corpo e seguir no balanço da música.\r\n', '9-12'),
(35, 'Quando o bebê pedir algo, apontando com o dedo, pronuncie o nome do objeto para que ele comece a se acostumar com o nome e repita com você.\r\n', '9-12'),
(36, 'Seu filho já sabe identificar as partes do corpo, quando solicitado. O uso de música infantil favorece a prática dessa atividade.\r\n', '9-12'),
(37, 'Coloque o bebê sentado no seu colo e mostre fotos, revistas e livros conversando sobre eles e imitando os sons do que vê. Aproveite esses momentos também para estimular seu filho a soprar velinhas, plumas e papéis.\r\n', '9-12'),
(38, 'Estimule a criança para brincar com a boneca, dar comida a ela, colocá-la para dormir, dar banho, a passear com o cachorro e pentear o ursinho. Peça a ela que faça o mesmo. Assim, brincando, ele vai aprendendo a fazer coisas simples com os objetos.', '9-12'),
(39, 'Estimule seu filho a caminhar sozinho, segurando em suas duas ma?os e depois apenas numa. É normal que caia ou perca o equilíbrio. Ajude-o a levantar-se para que continue tentando caminhar. Lembre-se da importância de transmitir confiança e segurança. Não faça das quedas e tropeços um grande problema.\r\n', '9-12'),
(40, 'Quando ele estiver em pé, apoiado em algum móvel, ofereça algum brinquedo para que ele se solte e caminhe, com muito cuidado!\r\n', '9-12'),
(41, 'Ofereça brinquedos para que ele os coloque em um pote ou caixa. Depois peça que retire e coloque em outra vasilha. Lembre-se que você deve estar presente e ter muito cuidado para que a criança não coloque qualquer objeto na boca, nariz ou orelhas.\r\n', '9-12'),
(42, 'Coloque um brinquedo sobre uma fralda ou pano de modo que ele na?o possa alcançar com as mãos. Mostre como pegá-lo arrastando.', '9-12'),
(43, 'Cante mu?sicas com diferentes ritmos incentivando a crianc?a a danc?ar, movimentar o corpo e seguir no balanc?o da mu?sica.\r\n', '9-12'),
(44, 'Quando o bebê pedir algo, apontando com o dedo, pronuncie o nome do objeto para que ele comece a se acostumar com o nome e repita com você.\r\n', '9-12'),
(45, 'Seu filho já sabe identificar as partes do corpo, quando solicitado. O uso de música infantil favorece a prática dessa atividade.\r\n', '9-12'),
(46, 'Coloque o bebê sentado no seu colo e mostre fotos, revistas e livros conversando sobre eles e imitando os sons do que vê. Aproveite esses momentos também para estimular seu filho a soprar velinhas, plumas e papéis.\r\n', '9-12'),
(47, 'Estimule a criança para brincar com a boneca, dar comida a ela, colocá-la para dormir, dar banho, a passear com o cachorro e pentear o ursinho. Peça a ela que faça o mesmo. Assim, brincando, ele vai aprendendo a fazer coisas simples com os objetos.', '9-12'),
(48, 'Estimule seu filho a caminhar sozinho, segurando em suas duas mãos e depois apenas numa. É normal que caia ou perca o equilíbrio. Ajude-o a levantar-se para que continue tentando caminhar. Lembre-se da importância de transmitir confiança e segurança. Não faça das quedas e tropeços um grande problema.\r\n', '9-12'),
(49, 'Quando ele estiver em pé, apoiado em algum móvel, ofereça algum brinquedo para que ele se solte e caminhe, com muito cuidado!\r\n', '9-12'),
(50, 'Ofereça brinquedos para que ele os coloque em um pote ou caixa. Depois peça que retire e coloque em outra vasilha. Lembre-se que você deve estar presente e ter muito cuidado para que a criança não coloque qualquer objeto na boca, nariz ou orelhas.\r\n', '9-12'),
(52, 'Coloque um brinquedo sobre uma fralda ou pano de modo que ele na?o possa alcanc?ar com as ma?os. Mostre como pega?-lo arrastando.', '9-12');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbfilhos`
--

CREATE TABLE `tbfilhos` (
  `idfilhos` int(11) NOT NULL,
  `sexofilhos` varchar(30) COLLATE latin1_general_ci DEFAULT NULL,
  `datanascimentofilho` date DEFAULT NULL,
  `nomefilho` varchar(80) COLLATE latin1_general_ci DEFAULT NULL,
  `fkidpais` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbpais`
--

CREATE TABLE `tbpais` (
  `idpais` int(11) NOT NULL,
  `telefonespais` int(11) DEFAULT NULL,
  `senhapais` int(11) DEFAULT NULL,
  `loginpais` varchar(80) COLLATE latin1_general_ci DEFAULT NULL,
  `emailpais` varchar(80) COLLATE latin1_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Extraindo dados da tabela `tbpais`
--

INSERT INTO `tbpais` (`idpais`, `telefonespais`, `senhapais`, `loginpais`, `emailpais`) VALUES
(1, NULL, 123, 'hegon', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbatividades`
--
ALTER TABLE `tbatividades`
  ADD PRIMARY KEY (`idatividades`);

--
-- Indexes for table `tbfilhos`
--
ALTER TABLE `tbfilhos`
  ADD PRIMARY KEY (`idfilhos`),
  ADD KEY `fkidpais` (`fkidpais`);

--
-- Indexes for table `tbpais`
--
ALTER TABLE `tbpais`
  ADD PRIMARY KEY (`idpais`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbatividades`
--
ALTER TABLE `tbatividades`
  MODIFY `idatividades` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- AUTO_INCREMENT for table `tbfilhos`
--
ALTER TABLE `tbfilhos`
  MODIFY `idfilhos` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbpais`
--
ALTER TABLE `tbpais`
  MODIFY `idpais` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `tbfilhos`
--
ALTER TABLE `tbfilhos`
  ADD CONSTRAINT `tbfilhos_ibfk_1` FOREIGN KEY (`fkidpais`) REFERENCES `tbpais` (`idpais`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
